package com.applitools.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WaitUtils extends BasePage{

    public static void waitForElementToBeClickableAndClick(WebElement elm){
        wait.until(ExpectedConditions.elementToBeClickable(elm));
        elm.click();
    }

    public static void waitForElementToBeVisible(WebElement elm){
        wait.until(ExpectedConditions.visibilityOf(elm));
    }

    public static void waitForElementToBeInvisible(WebElement elm){
        wait.until(ExpectedConditions.invisibilityOf(elm));
    }
}
