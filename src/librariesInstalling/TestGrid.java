package librariesInstalling;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestGrid {
	static WebDriver driver;
	 static String nodeURL;
	 
	public static void main(String[] args) throws MalformedURLException {
		 
		 nodeURL=" http://10.177.134.66:12990/wd/hub";
		 ChromeOptions options = new ChromeOptions();
		 DesiredCapabilities capabalities= DesiredCapabilities.chrome();
		 capabalities.setCapability(ChromeOptions.CAPABILITY, options);
		 capabalities.setBrowserName("chrome");
		 capabalities.setPlatform(Platform.WIN10);
		 driver = new RemoteWebDriver(new URL(nodeURL),capabalities);
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.get("http://amazon.in");
		 driver.findElement(By.linkText("Today's Deals")).click();
	}

}
