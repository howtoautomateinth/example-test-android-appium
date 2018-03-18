package steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class WelcomeSteps {

    private AppiumHelper appiumHelper;
    private AppiumDriver appiumDriver;

    @When("^I launch demo app$")
    public void iLaunchDemoApp() throws Throwable {
        appiumHelper = new AppiumHelper();
        appiumHelper.Connect();
        appiumDriver = appiumHelper.getDriver();
    }

    @And("^The App opened$")
    public void theAppOpened() {
        appiumDriver.findElement(By.id("th.in.howtoautomate.helloworld:id/fab")).isEnabled();
    }

    @Then("^I see a welcome message \"([^\"]*)\"$")
    public void iSeeAWelcomeMessage(String message) {
        By byAndroidUIAutomator = new MobileBy.ByAndroidUIAutomator("new UiSelector().textContains(\""+message+"\")");
        appiumDriver.findElement(byAndroidUIAutomator);
    }

}
