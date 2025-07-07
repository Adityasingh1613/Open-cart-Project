package testBase;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class  BaseClass {

    public WebDriver driver;
    public Logger logger;

    @BeforeClass
    public void setup() {
        logger = LogManager.getLogger(this.getClass());
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/");
        logger.info("Launching browser and opening URL");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public String randomString() {
        String rmail = RandomStringUtils.randomAlphabetic(5);
        return rmail;
    }

    public String randomNumbers() {
        String rnumber = RandomStringUtils.randomNumeric(10);
        return rnumber;
    }

    public String randomAlphaNumbers() {
        String ralphan = RandomStringUtils.randomAlphanumeric(5);
        return ralphan;
    }

}
