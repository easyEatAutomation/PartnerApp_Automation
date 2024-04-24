package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class SendEmail extends WebBase {

	public static WebDriver driver;
	
	
private By ClickOnEmailButton= By.xpath ("//*[@id=\"mat-dialog-1\"]/app-open-drawer/div/div[2]/div/div/div[2]");
private By EnaterEmail = By.xpath("");
private By ClickOnSend = By.xpath("");




public void ClickOnEmailButton() throws InterruptedException {
	clickOnElement(ClickOnEmailButton, "Click On Email Button", 10);

}

public void EnaterEmail(String EnterEmail) {

	enterTextInTextbox(EnaterEmail, "Enater Email", EnterEmail, 10);

}

public void ClickOnSend() throws InterruptedException {
	clickOnElement(ClickOnSend, "Click On Send", 10);  
 
  } 
}