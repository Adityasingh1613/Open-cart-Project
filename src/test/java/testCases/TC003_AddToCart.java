package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC003_AddToCart extends BaseClass {

    @Test
    public void Verify_Add_To_cart() {
        logger.info("** Starting TC003_AddToCart **");

        try{
            HomePage hp = new HomePage(driver);
            hp.setSearch();
            logger.info("Clicked on the Search Button");




        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.info("Test Failed..");
            logger.debug("Debug logs..");
        }
        logger.info("** Finished TC003_AddToCart **");
    }
}
