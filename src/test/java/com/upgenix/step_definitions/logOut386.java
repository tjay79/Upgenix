package com.upgenix.step_definitions;

import com.upgenix.pages.InboxPage;
import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.BrowserUtils;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logOut386 {

    LoginPage loginPage = new LoginPage();
    InboxPage inboxPage=new InboxPage();
    @Given("user is on the inbox page")
    public void user_is_on_the_inbox_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.emailInput.sendKeys("posmanager45@info.com");
        loginPage.passwordInput.sendKeys("posmanager");
        loginPage.logInButton.click();
        Assert.assertTrue(Driver.getDriver().getTitle().equals("Odoo"));
    }
    @When("the user logs out")
    public void the_user_logs_out() {

        inboxPage.profile.click();
        inboxPage.logoutButton.click();
    }
    @Then("user should be logged out and back on the login page")
    public void user_should_be_logged_out_and_back_on_the_login_page() {
        String expectedTitle = "Login | Best solution for startups";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
