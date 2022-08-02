package com.automation.tests;

import org.testng.annotations.Test;

public class AddVacancyTest extends BaseTest {

    @Test
    public void verifyUserCanAddVacancy()  {
        loginPage.verifyPage();
        loginPage.doLogin();
        homePage.clickOnVacanciesTab();
        vacanyListingPage.clickOnAddBtn();
        addVacancyPage.fillAddVacancyDetails();
        addVacancyPage.clickOnSaveBtn();
    }

    @Test
    public void verifyUserCanDeleteVacancy() {
        loginPage.doLogin();
        homePage.clickOnVacanciesTab();
        vacanyListingPage.selectVacanyCheckBox();
        vacanyListingPage.clickOnDeleteVacancy();
        vacanyListingPage.clickOnOkOnDeleteVacancyPopUp();
        vacanyListingPage.verifyDeleteVacancySuccessMsg();
    }
}
