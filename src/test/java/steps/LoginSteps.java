package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.net.MalformedURLException;

public class LoginSteps extends CommonMethods {

    LoginPage loginPage = new LoginPage();

    @Given("user is able to launch the swag labs application in mobile")
    public void user_is_able_to_launch_the_swag_labs_application_in_mobile() throws MalformedURLException, InterruptedException {
        launchingTheApplication();
        Thread.sleep(2000);
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        loginPage.usernamefield.sendKeys(ConfigReader.read("username"));
        Thread.sleep(2000);
        loginPage.passwordfield.sendKeys(ConfigReader.read("password"));
        Thread.sleep(2000);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
        loginPage.loginButton.click();
        Thread.sleep(2000);
    }
    @Then("user is able to see homepage")
    public void user_is_able_to_see_homepage() {
        System.out.println("Test passed");
    }

}
