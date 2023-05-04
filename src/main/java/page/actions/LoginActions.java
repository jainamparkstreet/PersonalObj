package page.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import page.locators.LoginLocators;
import utils.SeleniumDriver;

public class LoginActions {
	
	 LoginLocators loginLocators = null;
	 
	 public LoginActions(){
		 this.loginLocators= new LoginLocators();
		 PageFactory.initElements(SeleniumDriver.getDriver(), loginLocators);	
		 
	 }
	 
	 public void VerifyOnLoginPage(String string) {
		 System.out.println(string);
		 Assert.assertEquals(string, SeleniumDriver.getDriver().getCurrentUrl());
	 }
	 
	 public void enterCredentailsandclicklogin(String username, String password) {
		 
		 loginLocators.userNameFiled.click();
		 loginLocators.userNameFiled.sendKeys(username);
		 loginLocators.passwordField.click();
		 loginLocators.passwordField.sendKeys(password);
		 loginLocators.loginButton.click();
	 }
	 
	 public void VerifyUserLoggedIn() throws InterruptedException {
		 
		 Thread.sleep(5000);
		 System.out.println("Dimi");
		 loginLocators.collapse.click();
		 Thread.sleep(5000);
		 loginLocators.backtolegacy.click();
		 Thread.sleep(5000);
	 }
}
