package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public void doLogin() {
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin" + Keys.ENTER);

        WebElement passWord = driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("admin123" + Keys.ENTER);
    }
}
