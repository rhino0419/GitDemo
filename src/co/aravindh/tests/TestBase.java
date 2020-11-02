package co.aravindh.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\X009091\\Documents\\My work\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
	}
	
	@AfterSuite
	public void closingDriver() {
		TestBase.driver.quit();
	}
}
