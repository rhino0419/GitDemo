package co.aravindh.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FbHomePage {
   
	WebDriver driver;

	public FbHomePage(WebDriver driver) {
		 
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/span[1]/div[1]/div[1]/i[1]") WebElement dropDown;
	@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]]") WebElement logout;

	public void setDropDown() {
		 dropDown.click();
		 System.out.println("india");
		 System.out.println("australia");
		 System.out.println("srilanka");
	}
	public void clickLogout() {
		logout.click();
	}
	
	
}
