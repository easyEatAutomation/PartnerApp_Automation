package pageElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;
import io.appium.java_client.MobileBy;



public class LoginPageMobile extends WebBase {
	public WebDriver driver1;
	//public WebDriver driver;
	
	
	private By usernamevalue = MobileBy.AccessibilityId("emailInput");	
	private By passwordvalue = MobileBy.AccessibilityId("passwordInput");	
	private By loginButton = MobileBy.AccessibilityId("loginButton");	
	private By login_sucess = By.xpath("//*[@id=\"cdk-overlay-0\"]/nz-message-container/div");	
	private By click_one = MobileBy.AccessibilityId("9");	
	private By click_two = MobileBy.AccessibilityId("5");		
	private By click_three = MobileBy.AccessibilityId("8");		
	private By click_four = MobileBy.AccessibilityId("6");		
	private By click_SignIn = MobileBy.AccessibilityId("SIGN IN");
		


	 public void enterUsername(String username) {	 
		 enterTextInTextboxMobile(usernamevalue, "Username", username, 10);	 // Explicitly click the password field to move focus	 
		 //driver1.findElement(passwordvalue).click();	
		 }
	 
	 
	 public void enterPassword(String password) throws InterruptedException {	 
		 enterTextInTextboxMobile(passwordvalue, "Password", password, 10);	 
		 Thread.sleep(1000);	 
	 }
	 
	 
	public void loginClick() throws InterruptedException {
		clickOnElement(loginButton, "Clicked on Login Button", 10);		
		Thread.sleep(1000);
	}			
	public void login_successfully() throws InterruptedException {		
		toastmessage(login_sucess, "Login successful", 10);
		Thread.sleep(1000);
	}	
	
	public void click_one()throws InterruptedException {
		clickOnElement(click_one, "clicked on one", 10);
	}
	
	public void click_two()throws InterruptedException {
		clickOnElement(click_two, "clicked on two", 10);
		
	}	
	
	public void click_three()throws InterruptedException 
	{
		clickOnElement(click_three, "clicked three", 10);
		
	}	
	
	public void click_four()throws InterruptedException 
	{
		clickOnElement(click_four, "clicked on four", 10);	
		}
	public void click_SignIn() throws InterruptedException 	
	{		
		clickOnElement(click_SignIn, "clicked on Sign In button", 10);


		Thread.sleep(2500);		//closeBrowser();		
	}



}