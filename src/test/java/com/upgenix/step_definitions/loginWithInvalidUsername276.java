package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginWithInvalidUsername276 {

    LoginPage loginPage = new LoginPage();


    @When("user enters an invalid {int}")
    public void user_enters_an_invalid(Integer int1) {
        loginPage.emailInput.sendKeys("posmanager"+int1+"@info.com");
    }
    @When("a valid password {string}")
    public void a_valid_password(String string) {
        loginPage.passwordInput.sendKeys(string);
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.logInButton.click();
    }
    @Then("user should see the Wrong login\\/password message")
    public void user_should_see_the_wrong_login_password_message() {
        Assert.assertTrue(loginPage.wrongLoginPasswordMessage.isDisplayed());
    }
}
