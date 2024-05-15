package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class SendEmail extends WebBase {

	public static WebDriver driver;
	
	
private By ClickOnEmailButton= By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div/button[3]");

private By enterEmail = By.xpath("//*[@id=\"email\"]");
private By ClickOnSend = By.xpath("//*[@id=\"mat-dialog-4\"]/app-email-invoice/div/div[3]/button");




public void ClickOnEmailButton() throws InterruptedException {
	clickOnElement(ClickOnEmailButton, "Click On Email Button", 10);
	Thread.sleep(1000);

}

public void EnterEmail(String EnterEmail) throws InterruptedException {

	enterTextInTextbox(enterEmail, "Enter Email", EnterEmail, 10);
	Thread.sleep(1000);

}

public void ClickOnSend() throws InterruptedException {
	clickOnElement(ClickOnSend, "Click On Send", 10);  
 
  } 
}