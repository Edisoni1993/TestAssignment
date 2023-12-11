package com.applitools.pages;

import com.applitools.utilities.BasePage;
import com.applitools.utilities.ConfigurationReader;
import com.applitools.utilities.WaitUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "log-in")
    private WebElement signInButton;

    public void login(){
        WaitUtils.waitForElementToBeVisible(usernameField);
        usernameField.sendKeys(ConfigurationReader.getProperty("username"));
        passwordField.sendKeys(ConfigurationReader.getProperty("password"));
        signInButton.click();
    }
}
