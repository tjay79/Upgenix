package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginWithInvalidPassword265 {

    LoginPage loginPage = new LoginPage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters the {int}")
    public void user_enters_the(Integer int1) {
        loginPage.emailInput.sendKeys("salesmanager"+int1+"@info.com");
    }
    @When("user enters the wrong {string}")
    public void user_enters_the_wrong(String string) {
        loginPage.passwordInput.sendKeys(string);
    }
    @When("user clicks the log in button")
    public void user_clicks_the_log_in_button() {
        loginPage.logInButton.click();
    }
    @Then("user should see the {string} message")
    public void user_should_see_the_message(String string) {
        Assert.assertTrue(loginPage.wrongLoginPasswordMessage.isDisplayed());

    }
}
