package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddVacancyPage extends BasePage{

    @FindBy(id = "addJobVacancy_hiringManager")
    WebElement HiringManagerField;

    @FindBy(id = "addJobVacancy_name")
    WebElement vacancyNameField;

    @FindBy(id = "addJobVacancy_jobTitle")
    WebElement jobTitleDropDown;

    @FindBy(id = "btnSave")
    WebElement saveBtn;

    public AddVacancyPage(){
        PageFactory.initElements(driver,this);
    }

    public void fillAddVacancyDetails(){
        selectJobTitle();
        enterVacancyName();
        enterHiringManager();
    }

    public void selectJobTitle(){
        Select catDropDownSelect = new Select(jobTitleDropDown);
        catDropDownSelect.selectByVisibleText("Automation Tester");
    }

    public void enterVacancyName(){
        vacancyNameField.sendKeys("tester" + Keys.ENTER);
    }

    public void enterHiringManager(){
        HiringManagerField.sendKeys("Admin A" + Keys.ENTER);
    }

    public void clickOnSaveBtn(){
        saveBtn.click();
    }
}
