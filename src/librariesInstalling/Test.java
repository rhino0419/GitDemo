package librariesInstalling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class Test {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver", "C:/Users/X009091/Documents/My work/Selenium/geckodriver-v0.27.0-win64/geckodriver.exe");

		System.setProperty("webdriver.chrome.driver", "C:/Users/X009091/Documents/My work/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();

	}

}
