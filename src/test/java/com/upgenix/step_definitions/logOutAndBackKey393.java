package com.upgenix.step_definitions;

import com.upgenix.pages.InboxPage;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class logOutAndBackKey393 {

    InboxPage inboxPage=new InboxPage();

    @Then("user should be not be able to go back to the inbox by pressing the Back key")
    public void user_should_be_not_be_able_to_go_back_to_the_inbox_by_pressing_the_back_key() {
        Driver.getDriver().navigate().back();
        Assert.assertTrue(inboxPage.sessionExpiredAlert.isDisplayed());
    }
}
