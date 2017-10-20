package Support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSupport {
    private static WebDriver driver;

    public static WebDriver initDriver(String browser){
        if (browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", "/Users/dzanan/Downloads/geckodriver");
            driver = new FirefoxDriver();

        }

        else if (browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/dzanan/Downloads/chromedriver");
            driver = new ChromeDriver();
        }

        else if(browser.equals("safari")){
            driver = new SafariDriver();
        }

        else if(browser.equals("edge")){
            driver = new EdgeDriver();
        }

        else if(browser.equals("iexplorer")){
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
