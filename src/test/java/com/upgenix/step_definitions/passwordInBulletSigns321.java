package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class passwordInBulletSigns321 {

    LoginPage loginPage = new LoginPage();
    @When("user enters the username {string}")
    public void user_enters_the_username(String string) {
        loginPage.emailInput.sendKeys(string);
    }
    @When("user enters the password {string}")
    public void user_enters_the_password(String string) {
        loginPage.passwordInput.sendKeys(string);
    }
    @Then("user should see the password in bullet signs")
    public void user_should_see_the_password_in_bullet_signs() {
        Assert.assertTrue(loginPage.passwordInput.getAttribute("type").equals("password"));
    }
}
