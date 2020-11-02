package co.aravindh.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import co.aravindh.pages.FbHomePage;
import co.aravindh.pages.FbLoginPage;

public class FbLoginTest extends TestBase {
   
	@Test
	public void init() throws InterruptedException {
		FbLoginPage loginPage = PageFactory.initElements(driver, FbLoginPage.class);
		loginPage.setEmailBox("ek.aravindh@gmail.com");
		loginPage.setPasswordBox("beyblade2");
		loginPage.clickLoginButton();
		
		FbHomePage homepage = PageFactory.initElements(driver,FbHomePage.class);
		 
		homepage.setDropDown();
		Thread.sleep(4000);
		homepage.clickLogout();
	}
}
