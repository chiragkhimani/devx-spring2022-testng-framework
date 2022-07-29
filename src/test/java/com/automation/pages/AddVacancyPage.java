package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddVacancyPage {

    WebDriver driver = DriverUtils.getDriver();

    public void fillAddVacancyDetails(){
        selectJobTitle();
        enterVacancyName();
        enterHiringManager();
    }

    public void selectJobTitle(){
        WebElement jobTitleDropDown = driver.findElement(By.id("addJobVacancy_jobTitle"));
        Select catDropDownSelect = new Select(jobTitleDropDown);
        catDropDownSelect.selectByVisibleText("Automation Tester");
    }

    public void enterVacancyName(){
        WebElement vacancyNameField = driver.findElement(By.id("addJobVacancy_name"));
        vacancyNameField.sendKeys("tester" + Keys.ENTER);
    }

    public void enterHiringManager(){
        WebElement HiringManagerField = driver.findElement(By.id("addJobVacancy_hiringManager"));
        HiringManagerField.sendKeys("Admin A" + Keys.ENTER);
    }

    public void clickOnSaveBtn(){
        WebElement saveBtn = driver.findElement(By.id("btnSave"));
        saveBtn.click();
    }
}
