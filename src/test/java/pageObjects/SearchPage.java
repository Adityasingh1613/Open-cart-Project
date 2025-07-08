package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@name=\"search\"]")
    WebElement SearchBar;

    @FindBy(xpath = "//select[@class=\"form-control\"]")
    WebElement Catagories;

    @FindBy(xpath = "//input[@name=\"description\"]")
    WebElement CheckBox;

    @FindBy(xpath = "//input[@id=\"button-search\"]")
    WebElement Button;
}
