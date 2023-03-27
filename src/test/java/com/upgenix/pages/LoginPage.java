package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logInButton;

    @FindBy(xpath = "//p")
    public WebElement wrongLoginPasswordMessage;

    @FindBy(xpath = "//b[.='Sign in']")
    public WebElement signinBtn;

    @FindBy(xpath = "//span[.='POSManager45']")
    public WebElement POSManager45;
}
