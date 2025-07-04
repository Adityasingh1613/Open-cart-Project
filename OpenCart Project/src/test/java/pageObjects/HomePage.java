package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement MyAccount;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement Registration;

    public void setMyAccount() {
        MyAccount.click();
    }

    public void setRegistration() {
        Registration.click();
    }

}
