package firtTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This is the first test for QA2
 */
public class MainPageFirstTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();)
        driver.manage().window().maximize();
        driver.get("http://javaguru.lv");
        driver.quit();
    }
}