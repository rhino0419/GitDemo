package librariesInstalling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDDT {
  @Test(dataProvider = "testdata")
  public void TestChrome(String username,String password) {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\X009091\\Documents\\My work\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
  }
  
  @DataProvider(name="testdata")
  public Object[][] TestDataFeed(){
	  
	  Object [][] faceBookdata = new Object[2][2];
	  faceBookdata[0][0]="username1@gmail.com";
	  faceBookdata[0][1]="passworde1";
	  

	  faceBookdata[1][0]="username2@gmail.com";
	  faceBookdata[1][1]="passworde2";
	return faceBookdata;
	  
  }
}
