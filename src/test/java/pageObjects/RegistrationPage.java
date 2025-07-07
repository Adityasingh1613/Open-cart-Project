package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-firstname")
    WebElement firstname;

    @FindBy(id = "input-lastname")
    WebElement lastname;

    @FindBy(id = "input-email")
    WebElement email;

    @FindBy(id = "input-telephone")
    WebElement telephone;

    @FindBy(id = "input-password")
    WebElement password;

    @FindBy(id = "input-confirm")
    WebElement confirmpassword;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement policy;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement submit;

    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement message;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement continuess;


    public void setFirstname(String fname) {
        firstname.sendKeys(fname);
    }

    public void setLastname(String lname) {
        lastname.sendKeys(lname);
    }

    public void setEmail(String mail) {
        email.sendKeys(mail);
    }

    public void setTelephone(String phn) {
        telephone.sendKeys(phn);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void setConfirmpassword(String pwd) {
        confirmpassword.sendKeys(pwd);
    }

    public void setPolicy() {
        policy.click();
    }

    public void setSubmit() {
        submit.click();
    }

    public String getConfirmation() {
        try {
            return (message.getText());
        } catch (Exception e) {
            return (e.getMessage());
        }
    }

    public void setContinuess() {
        continuess.click();
    }
}
