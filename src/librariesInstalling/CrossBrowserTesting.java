package librariesInstalling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
  
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	
	public void setup(String browser) throws Exception {
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\X009091\\Documents\\My work\\Selenium\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\X009091\\Documents\\My work\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else {
			throw new Exception("There is no broswser");
			
		}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}
	
	@Test
	public void testAmazon() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"))	.click();
		//driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();
	
		driver.findElement(By.id("ap_email")).sendKeys("ek.aravindh@gmail.com");
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("bebylade1");
		driver.findElement(By.id("signInSubmit")).click();
	}
	
	//@FindBy(how=How.XPATH,using="");
	@CacheLookup
	WebElement logout;
	
	/*
	 * @AfterTest public void driverClose() { driver.close(); }
	 */
}
