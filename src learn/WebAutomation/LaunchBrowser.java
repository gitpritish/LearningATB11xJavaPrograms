package WebAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {

		// step 1: https://googlechromelabs.github.io/chrome-for-testing/#stable
		// step 2: export it and copy the pathname and then add in the script

		System.setProperty("webdriver.chrome.driver","/Users/pritishkhedekar/Documents/driver/chromedriver-mac-arm64/chromedriver");
		// WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		System.out.println("Launched Successfully");
		driver.close();

	}
}
