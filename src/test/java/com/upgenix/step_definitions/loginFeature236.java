package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginFeature236 {

    LoginPage loginPage= new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("the user enters valid {int}")
    public void the_user_enters_valid(Integer int1) {
        loginPage.emailInput.sendKeys("posmanager"+int1+"@info.com");
    }
    @When("the user enters  valid {string}")
    public void the_user_enters_valid(String password) {
        loginPage.passwordInput.sendKeys(password);
    }

    @And("the user clicks on the log in button")
    public void theUserClicksOnTheLogInButton() {
        loginPage.logInButton.click();
    }
    @Then("the user should be on the inbox page")
    public void the_user_should_be_on_the_inbox_page() {
        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }


}
