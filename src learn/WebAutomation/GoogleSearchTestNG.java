package WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class GoogleSearchTestNG {

    WebDriver driver;

    @BeforeClass
    public void setupBrowser() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/pritishkhedekar/Documents/driver/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void testSearchTitle() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Radhe");
        searchBox.sendKeys(Keys.RETURN);

        try {
            Thread.sleep(2000); // Quick wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String title = driver.getTitle();
        Assert.assertTrue(title.toLowerCase().contains("radhe"), "Title does not contain 'Radhe'");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
