package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class validUsernameAndNoPassword282 {

    LoginPage loginPage = new LoginPage();
    @When("the user enters a valid {int}")
    public void the_user_enters_a_valid(Integer int1) {
        loginPage.emailInput.sendKeys("salesmanager"+int1+"@info.com");
    }
    @When("doesn't enter a password")
    public void doesn_t_enter_a_password() {

        loginPage.passwordInput.sendKeys(Keys.ENTER);
    }
    @Then("the user should see the please fill out this field message")
    public void the_user_should_see_the_please_fill_out_this_field_message() {
        String actualMessage = loginPage.passwordInput.getAttribute("validationMessage");
        String expectedMessage = "Please fill out this field.";
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
