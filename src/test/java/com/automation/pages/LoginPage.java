package com.automation.pages;

import com.automation.tests.AddVacancyTest;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    WebDriver driver = DriverUtils.getDriver();

    public void doLogin() {
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin" + Keys.ENTER);

        WebElement passWord = driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("admin123" + Keys.ENTER);
    }
}
