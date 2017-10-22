package com.github.navigator.testing.tests;

import com.github.navigator.testing.pageobjects.HomePage;
import com.github.navigator.testing.pageobjects.LoginPage;
import com.github.navigator.testing.support.BrowserSupport;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;


    @BeforeClass
    @Parameters({"browser", "url"})
    public void setUp(String browser, String url) {
        driver = BrowserSupport.initDriver(browser);
        driver.get(url);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    @Parameters({"email", "pass"})
    public void logIn(String email, String pass){

        loginPage.enterMail(email);
        loginPage.enterPass(pass);
        loginPage.logIn();
        Assert.assertTrue(homePage.hasLanded());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
