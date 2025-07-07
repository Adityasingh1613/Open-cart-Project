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

    @FindBy(xpath = "//a[normalize-space()='Login']//a[normalize-space()='Login']")
    WebElement Login;

    @FindBy(xpath = "//span[normalize-space()='Wish List (0)']")
    WebElement WishList;

    @FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
    WebElement ShoppingCart;

    @FindBy(xpath = "//span[normalize-space()='Checkout']")
    WebElement CheckOut;


    public void setMyAccount() {
        MyAccount.click();
    }

    public void setRegistration() {
        Registration.click();
    }

    public void setLogin(){
        Login.click();
    }

    public void setShoppingCart(){
        ShoppingCart.click();
    }

    public void setWishList(){
        WishList.click();
    }

    public void setCheckOut(){
        CheckOut.click();
    }

}
