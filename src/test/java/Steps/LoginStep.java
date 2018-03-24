package Steps;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStep extends TestBase{
    private TestBase base;

    public LoginStep(TestBase base){
        this.base = base;
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String arg0) throws Throwable {
        base.loginPage.setEmail(arg0);
    }

    @Given("^I open login page$")
    public void iOpenLoginPage() throws Throwable {
        base.loginPage.open();
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String arg0) throws Throwable {
        base.loginPage.setPassword(arg0);
    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        base.loginPage.clickLoginButton();
    }

    @Then("^I should be logged in$")
    public void iShouldBeLoggedIn() throws Throwable {
        Assert.assertTrue(base.kokpitPage.logoutButtonIsVisible());
    }

    @And("^I wait (\\d+) seconds$")
    public void iWaitSeconds(int seconds) throws Throwable {
        int waitMs = seconds * 1000;
        Thread.sleep(waitMs);
    }
}
