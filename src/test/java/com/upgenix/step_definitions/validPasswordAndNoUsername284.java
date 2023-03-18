package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class validPasswordAndNoUsername284 {

    LoginPage loginPage = new LoginPage();
    @When("the user doesn't enter a username")
    public void the_user_doesn_t_enter_a_username() {

        loginPage.emailInput.sendKeys(Keys.ENTER);
    }

    @When("the user enters a valid password")
    public void the_user_enters_a_valid_password() {
        loginPage.passwordInput.sendKeys("salesmanager");
    }
    @Then("the user should see the please fill out this field message under the email field")
    public void the_user_should_see_the_please_fill_out_this_field_message_under_the_email_field() {
        String actualMessage = loginPage.emailInput.getAttribute("validationMessage");
        String expectedMessage = "Please fill out this field.";
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
