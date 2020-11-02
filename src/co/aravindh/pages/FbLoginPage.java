package co.aravindh.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 

public class FbLoginPage {
  
	WebDriver driver;

	public FbLoginPage(WebDriver driver) {
				this.driver = driver;
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='email']") WebElement emailBox;
	@FindBy(how=How.XPATH,using="//input[@id='pass']") WebElement passwordBox;
	@FindBy(how=How.XPATH,using=" //button[@id='u_0_b']") WebElement loginButton;

	 
	public void setEmailBox(String email) {
		 emailBox.sendKeys(email);
	}
 
	public void setPasswordBox(String password) {
		 passwordBox.sendKeys(password);
	}
	 
	public void clickLoginButton() {
		 loginButton.click();
	}
	
	
	
}
