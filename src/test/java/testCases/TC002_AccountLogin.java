package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.TestDataHolder;

public class TC002_AccountLogin extends BaseClass {

    @Test
    public void verify_login_with_registered_credentials() {
        logger.info("** Starting TC002_LoginTest **");

        try {
            HomePage hp = new HomePage(driver);
            hp.setMyAccount();
            logger.info("Clicked My Account");

            hp.setLogin();

            LoginPage lp = new LoginPage(driver);
            lp.setEmail(TestDataHolder.registeredEmail);
            logger.info("Entered Email: " + TestDataHolder.registeredEmail);

            lp.setPassword(TestDataHolder.registeredPassword);
            logger.info("Entered Password");

            lp.setLoginButton();
            logger.info("Clicked Login");

            logger.info("Login was successful");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.info("Test Failed..");
            logger.debug("Debug logs..");
        }

        logger.info("** Finished TC002_LoginTest **");
    }
}
