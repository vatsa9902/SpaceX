package spacex;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import io.cucumber.java.en.When;
import util.ProjectPropertyUtil;
import util.RestBase;

public class LaunchStepDefinitions {

    private static final Logger logger = LogManager.getLogger(LaunchStepDefinitions.class);
    private RestBase restBase;

    public LaunchStepDefinitions(RestBase restBase) {
        this.restBase = restBase;
    }
    @When("Get the latest launch")
    public void getTheLatestLaunch() {
        logger.info("[Step]: Get the latest launch");
        restBase.get(ProjectPropertyUtil.getValue("spaceX.baseuri")+ProjectPropertyUtil.getValue("launchLatest.path"));
        }

    @When("Get the roadster details")
    public void getTheRocketDetails() {
        logger.info("[Step]: Get the roadster details");
        restBase.get(ProjectPropertyUtil.getValue("spaceX.baseuri")+ProjectPropertyUtil.getValue("roadster.path"));
        }

    @When("Get the company details")
    public void getTheCoreDetails() {
        logger.info("[Step]: Get the company details");
        restBase.get(ProjectPropertyUtil.getValue("spaceX.baseuri")+ProjectPropertyUtil.getValue("company.path"));
        }
}
