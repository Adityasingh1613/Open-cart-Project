package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-email']//input[@id='input-email']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement Password;

    public void setEmail(String mail){
        Email.sendKeys(mail);
    }

    public void setPassword(String pwd){
        Password.sendKeys(pwd);
    }
}
