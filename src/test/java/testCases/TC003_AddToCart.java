package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SearchPage;
import testBase.BaseClass;

public class TC003_AddToCart extends BaseClass {

    @Test
    public void Verify_Add_To_cart() {
        logger.info("** Starting TC003_AddToCart **");

        try {
            HomePage hp = new HomePage(driver);
            hp.setSearch();
            logger.info("Clicked on the Search Button");

            SearchPage s = new SearchPage(driver);

            s.setSearchBar("iphone");
            logger.info("Entered 'iphone' in the search bar");

            s.setCheckBox();
            logger.info("Checked the 'Search in product descriptions' checkbox");

            s.setButton();
            logger.info("Clicked the Search button");

            WebElement iphone = driver.findElement(By.xpath("//button[@onclick=\"cart.add('40', '1');\"]"));
            iphone.click();

            WebElement ipod_Nano = driver.findElement(By.xpath("//button[@onclick=\"cart.add('36', '1');\"]"));
            ipod_Nano.click();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.info("Test Failed..");
            logger.debug("Debug logs..");
        }
        logger.info("** Finished TC003_AddToCart **");
    }
}
