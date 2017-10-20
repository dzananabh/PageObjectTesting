import Support.BrowserSupport;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import PageObjects.*;
import org.testng.annotations.Test;

public class RegisterTest {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeClass
    @Parameters ({"browser", "url"})
    public void setUp(String browser, String url){
        driver = BrowserSupport.initDriver(browser);
        driver.get(url);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);

    }

    @Test
    @Parameters({"email", "pass", "firstName", "lastName"})
    public void registerUser(String email, String pass, String firstName, String lastName){

        loginPage.inputPass(pass);
        loginPage.enterName(firstName, lastName);
        loginPage.inputEmail(email);
        loginPage.repeatMail(email);
        loginPage.selectDay("21");
        loginPage.selectMonth("10");
        loginPage.selectYear("1985");
        loginPage.selMale();
        loginPage.Register();
        Assert.assertTrue(homePage.hasLanded());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
