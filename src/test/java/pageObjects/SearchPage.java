package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-search']")
    WebElement SearchBar;

    @FindBy(xpath = "//select[@class=\"form-control\"]")
    WebElement Catagories;

    @FindBy(xpath = "//input[@name=\"description\"]")
    WebElement CheckBox;

    @FindBy(xpath = "//input[@id=\"button-search\"]")
    WebElement Button;

    public void setSearchBar(String search){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(SearchBar));
        SearchBar.clear();
        SearchBar.sendKeys(search);
    }

    public void setCatagories(){
        Catagories.click();
    }

    public void setCheckBox(){
        CheckBox.click();
    }

    public void setButton(){
        Button.click();
    }
}
