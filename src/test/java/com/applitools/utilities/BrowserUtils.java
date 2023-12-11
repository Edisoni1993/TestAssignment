package com.applitools.utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BrowserUtils extends BaseClass{

    public static void pageVerification(String act, String exp){
        Assert.assertEquals(act, exp);
    }
}
