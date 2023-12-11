package com.applitools.tests;

import com.applitools.pages.LoginPage;
import com.applitools.utilities.BaseClass;
import com.applitools.utilities.BrowserUtils;
import com.applitools.utilities.ConfigurationReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    private LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void setUpMethod(){

        driver.get(ConfigurationReader.getProperty("url"));
    }

    @Test
    public void loginTest() throws InterruptedException {

        loginPage.login();

        /*
        Verifying that we're logged in and dashboard page is open.
        Adding the below sleep just to see the dashboard opening.
        We don't need it and the test passes without it as well. I just added for demo purposes.
         */

        Thread.sleep(3000);
        BrowserUtils.pageVerification(driver.getTitle(), "ACME demo app");
    }
}
