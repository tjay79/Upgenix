package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class loginWithEnterKey323 {

    LoginPage loginPage = new LoginPage();
    @When("the user enters a valid username {string}")
    public void the_user_enters_a_valid_username(String string) {
        loginPage.emailInput.sendKeys(string);
    }
    @When("the user enters a valid password {string}")
    public void the_user_enters_a_valid_password(String string) {
        loginPage.passwordInput.sendKeys(string);
    }
    @When("the user hits the Enter key on the keyboard")
    public void the_user_hits_the_enter_key_on_the_keyboard() {
        loginPage.passwordInput.sendKeys(Keys.ENTER);
    }
    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.sleep(4);
        Assert.assertTrue(Driver.getDriver().getTitle().equals("#Inbox - Odoo"));
    }
}
