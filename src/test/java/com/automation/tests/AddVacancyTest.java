package com.automation.tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;

public class AddVacancyTest {

    @Test
    public void verifyUserCanAddVacancy() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin" + Keys.ENTER);

        WebElement passWord = driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("admin123" + Keys.ENTER);

        WebElement recruitmentTab = driver.findElement(By.id("menu_recruitment_viewRecruitmentModule"));
        recruitmentTab.click();

        WebElement vacanciesTab = driver.findElement(By.id("menu_recruitment_viewJobVacancy"));
        vacanciesTab.click();

        WebElement AddBtn = driver.findElement(By.xpath("//div[@class='top']/input[@name='btnAdd']"));
        AddBtn.click();

        WebElement jobTitleDropDown = driver.findElement(By.id("addJobVacancy_jobTitle"));
        Select catDropDownSelect = new Select(jobTitleDropDown);
        Thread.sleep(3000);
        catDropDownSelect.selectByVisibleText("Automation Tester");
        Thread.sleep(3000);


        WebElement vacancyNameField = driver.findElement(By.id("addJobVacancy_name"));
        vacancyNameField.sendKeys("tester" + Keys.ENTER);
        WebElement HiringManagerField = driver.findElement(By.id("addJobVacancy_hiringManager"));
        HiringManagerField.sendKeys("Admin A" + Keys.ENTER);
        Thread.sleep(3000);

        WebElement saveBtn = driver.findElement(By.id("btnSave"));
        saveBtn.click();

        Thread.sleep(3000);

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("target//screenshot.png"));

        Thread.sleep(3000);
        driver.quit();
    }
}
