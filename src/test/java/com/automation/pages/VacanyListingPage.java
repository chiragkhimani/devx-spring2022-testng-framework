package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VacanyListingPage {

    public void clickOnAddBtn(){
        WebElement AddBtn = driver.findElement(By.xpath("//div[@class='top']/input[@name='btnAdd']"));
        AddBtn.click();
    }

    public void selectVacanyCheckBox(){
        WebElement vacancyCheckBx = driver.findElement(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord')]"));
        vacancyCheckBx.click();
    }

    public void clickOnDeleteVacancy(){
        driver.findElement(By.id("btnDelete")).click();
    }

    public void clickOnOkOnDeleteVacancyPopUp(){
        driver.findElement(By.id("dialogDeleteBtn")).click();
    }

    public void verifyDeleteVacancySuccessMsg(){
        WebElement successMsg = driver.findElement(By.xpath("//div[contains(@class,'success')]"));
        System.out.println(successMsg.getText());
    }

}
