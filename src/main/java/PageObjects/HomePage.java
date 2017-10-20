package PageObjects;

import Support.DriverObj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverObj{

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy (className = "_4kny")
    private WebElement userName;

    public boolean hasLanded(){
        return userName.isDisplayed();
    }
}
