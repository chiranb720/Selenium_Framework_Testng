package com.zapkiller.automation.config;

import com.zapkiller.automation.utils.UiAutomationUtils;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class Hooks {

    private static final Logger logger = LoggerFactory.getLogger(Hooks.class);
    public WebDriver driver;

    public UiAutomationUtils utils = new UiAutomationUtils();

    @BeforeSuite
    public void beforeSuite(){
        UiAutomationUtils.readConfig();

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class....");

    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method....");
    }

    @BeforeTest
    public void beforeTest(){
        utils.launchBrowser();
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("After Suite....");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("After Class....");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method....");
    }

    @AfterTest
    public void AfterTest(){
        utils.closeBrowser();
    }

}
