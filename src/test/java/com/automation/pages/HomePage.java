package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    public void clickOnVacanciesTab() {
        WebElement recruitmentTab = driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
        recruitmentTab.click();
        WebElement vacanciesTab = driver.findElement(By.id("menu_recruitment_viewJobVacancy"));
        vacanciesTab.click();
    }

}
