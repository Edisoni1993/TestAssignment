package com.applitools.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected static WebDriver driver = Driver.getDriver();
    protected static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    public BasePage(){
        PageFactory.initElements(driver, this);
    }
}
