package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

public class logOutByClosingTab409 {

    LoginPage loginPage = new LoginPage();
    @When("the user closes the tab")
    public void the_user_closes_the_tab() {
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.CONTROL).sendKeys("w").keyUp(Keys.CONTROL);
    }
    @When("opens a new page")
    public void opens_a_new_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Then("user should be logged out")
    public void user_should_be_logged_out() {
        try {
            Assert.assertTrue(loginPage.signinBtn.isDisplayed());
        }catch (NoSuchElementException e){
            Assert.assertFalse(loginPage.POSManager45.isDisplayed());
        }
    }
}
