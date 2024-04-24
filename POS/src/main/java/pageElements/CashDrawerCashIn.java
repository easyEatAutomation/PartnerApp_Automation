package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class CashDrawerCashIn extends WebBase {

	public static WebDriver driver;
	
private By CashIn = By.xpath ("//*[@id=\"mat-dialog-1\"]/app-open-drawer/div/div[2]/div/div/div[2]");
private By Name = By.xpath("//*[@id=\"mat-dialog-2\"]/app-update-cash/div/div[2]/form/div/div[1]/input");
private By Amount = By.xpath("//*[@id=\"mat-dialog-2\"]/app-update-cash/div/div[2]/form/div/div[2]/div[1]/input");	
private By CashInDoneButton = By.xpath("//*[@id=\"mat-dialog-2\"]/app-update-cash/div/div[2]/div[2]/button");





	
	public void CashIn() throws InterruptedException {
		clickOnElement(CashIn, "Cash In ", 10);

	}  

	public void name(String name) throws InterruptedException {
		enterTextInTextbox(Name,"user name", name, 100);
		Thread.sleep(2000);
	}

	public void amount(String amount) throws InterruptedException {
		enterTextInTextbox(Amount, "amount", amount, 10);  
	}     
	public void CashInDoneButton() throws InterruptedException {
		clickOnElement(CashInDoneButton, "Cash In Done button", 10);   

	}
}