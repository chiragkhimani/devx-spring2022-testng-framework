package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver = DriverUtils.getDriver();

    public void clickOnVacanciesTab() {
        WebElement recruitmentTab = driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
        recruitmentTab.click();
        WebElement vacanciesTab = driver.findElement(By.id("menu_recruitment_viewJobVacancy"));
        vacanciesTab.click();
    }

}
