package com.automation.tests;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


    @BeforeMethod
    public void setUp(){
        DriverUtils.createDriver();
    }

    @AfterMethod
    public void quit(){
        DriverUtils.getDriver().quit();
    }
}
