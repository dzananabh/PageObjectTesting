package com.github.navigator.testing.pageobjects;

import com.github.navigator.testing.support.DriverObj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends DriverObj {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "pass")
    private WebElement pass;

    @FindBy(id = "loginbutton")
    private WebElement loginBtn;

    @FindBy(name = "firstname")
    private WebElement firstName;

    @FindBy(name = "lastname")
    private WebElement lastName;

    @FindBy(name = "reg_email__")
    private WebElement regEmail;

    @FindBy(id = "u_0_l")
    private WebElement regPass;

    @FindBy(id = "month")
    private WebElement month;

    @FindBy(id = "day")
    private WebElement day;

    @FindBy(id = "year")
    private WebElement year;

    @FindBy(className = "_5k_2")
    private WebElement femaleRadio;

    @FindBy(className = "_5k_2")
    private WebElement maleRadio;

    @FindBy(id = "u_0_r")
    private WebElement submitBtn;

    @FindBy(linkText = "Sign Up")
    private WebElement landCheck;

    @FindBy(name = "reg_email_confirmation__")
    private WebElement repMail;

    /**
     * Checking if the landing page is opened
     */

    public boolean isOpened() {
        return landCheck.isDisplayed();
    }

    /**
     * Login new user if its already registered
     */

    public void enterMail(String email) {
        this.email.clear();
        this.email.sendKeys(email);
    }

    public void enterPass(String pass) {
        this.pass.clear();
        this.pass.sendKeys(pass);
    }

    /**
     * Registering new user
     */

    public void enterName(String firstName, String lastName) {
        this.firstName.clear();
        this.firstName.sendKeys(firstName);

        this.lastName.clear();
        this.lastName.sendKeys(lastName);
    }

    public void logIn() {
        loginBtn.click();
    }

    public void inputEmail(String regEmail) {
        this.regEmail.clear();
        this.regEmail.sendKeys(regEmail);
    }

    public void repeatMail(String repMail){
        this.repMail.clear();
        this.repMail.sendKeys(repMail);
    }

    public void inputPass(String regPass) {
        this.regPass.clear();
        this.regPass.sendKeys(regPass);
    }

    public void selectDay(String value) {
        Select daySel = new Select(day);
        daySel.selectByValue(value);
    }

    public void selectMonth(String value) {
        Select monthSel = new Select(month);
        monthSel.selectByValue(value);
    }

    public void selectYear(String value) {
        Select yearSel = new Select(year);
        yearSel.selectByValue(value);
    }

    public void selMale() {
        maleRadio.click();
    }

    public void selFemale() {
        femaleRadio.click();
    }

    public void Register(){
        submitBtn.click();
    }
}