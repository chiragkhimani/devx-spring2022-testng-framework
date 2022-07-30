package com.automation.tests;

import com.automation.pages.AddVacancyPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.VacanyListingPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class AddVacancyTest extends BaseTest{

    @Test
    public void verifyUserCanAddVacancy() throws Exception {
        LoginPage loginPage = new LoginPage() ;
        loginPage.doLogin();

        HomePage homePage = new HomePage();
        homePage.clickOnVacanciesTab();

        VacanyListingPage vacanyListingPage = new VacanyListingPage();
        vacanyListingPage.clickOnAddBtn();

        AddVacancyPage addVacancyPage = new AddVacancyPage();
        addVacancyPage.fillAddVacancyDetails();
        addVacancyPage.clickOnSaveBtn();
    }

    @Test
    public void verifyUserCanDeleteVacancy() throws Exception {
        LoginPage loginPage = new LoginPage();
        loginPage.doLogin();

        HomePage homePage = new HomePage();
        homePage.clickOnVacanciesTab();

        VacanyListingPage vacanyListingPage = new VacanyListingPage();
        vacanyListingPage.selectVacanyCheckBox();
        vacanyListingPage.clickOnDeleteVacancy();
        vacanyListingPage.clickOnOkOnDeleteVacancyPopUp();
        vacanyListingPage.verifyDeleteVacancySuccessMsg();
    }
}
