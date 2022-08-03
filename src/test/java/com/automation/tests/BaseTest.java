package com.automation.tests;

import com.automation.pages.AddVacancyPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.pages.VacanyListingPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    LoginPage loginPage;
    HomePage homePage ;
    VacanyListingPage vacanyListingPage;
    AddVacancyPage addVacancyPage;

    @BeforeMethod
    public void setUp(){
        ConfigReader.initProperties();
        DriverUtils.createDriver();
        loginPage = new LoginPage();
        homePage = new HomePage();
        vacanyListingPage = new VacanyListingPage();
        addVacancyPage = new AddVacancyPage();
    }

    @AfterMethod
    public void quit(){
        DriverUtils.getDriver().quit();
    }
}
