package com.automation.pages;

import com.automation.tests.AddVacancyTest;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage{

    @FindBy(id = "txtUsername")
    WebElement userName;

    @FindBy(id = "txtPassword")
    WebElement passWord;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void doLogin() {
        userName.sendKeys(ConfigReader.getProperty("login.username") + Keys.ENTER);
        passWord.sendKeys(ConfigReader.getProperty("login.password") + Keys.ENTER);
    }

    public void verifyPage() {
        Assert.assertTrue(userName.isDisplayed(),"User is not on login page");
        Assert.assertTrue(passWord.isDisplayed(),"User is not on login page");
    }
}
