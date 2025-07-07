package testCases;

import org.testng.Assert;
import utilities.TestDataHolder;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;


public class TC001_AccountRegistrationTest extends BaseClass {

    @Test
    public void verify_account_registration() {
        logger.info("** Starting TC001_AccountRegistrationTest ** ");
        try {
            HomePage hp = new HomePage(driver);
            hp.setMyAccount();
            logger.info("Clicked My Account");

            hp.setRegistration();
            logger.info("Clicked On Registration");

            String pass = randomAlphaNumbers();

            RegistrationPage rp = new RegistrationPage(driver);

            logger.info("** Filling all the details of the customer **");
            rp.setFirstname(randomString().toUpperCase());
            rp.setLastname(randomString().toUpperCase());
            rp.setEmail(randomString()+"@mail.com");
            String email = randomString()+"@mail.com";
            TestDataHolder.registeredEmail = email;
            TestDataHolder.registeredPassword = pass;
            rp.setTelephone(randomNumbers());
            rp.setPassword(pass);
            rp.setConfirmpassword(pass);
            rp.setPolicy();
            rp.setSubmit();
            String cnf = rp.getConfirmation();
            Assert.assertEquals(cnf, "Your Account Has Been Created!");
            logger.info(" Confirmation message is validated ");
            rp.setContinuess();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.info("Test Failed..");
            logger.debug("Debug logs..");
        }
        logger.info("** Finished TC001_AccountRegistrationTest **");
    }
}
