package com.automation.tests;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import org.testng.annotations.Test;

public class UserListingTest extends BaseTest{
    @Test
    public void verifySearchResultsForInvalidKeyword(){
        loginPage.doLogin();
        homePage.verifyPage();
        homePage.clickOnUsersLinkFromUserManagement();
        homePage.searchWithUsername("Selenium");
        homePage.verifyNoRecordFoundTextIsDisplayed();
    }
}
