package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class CashDrawerCashIn extends WebBase {

	public static WebDriver driver;
	
	private By CashIn = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-open-drawer/div/div[2]/div/div/div[2]");
	private By Name = By.xpath("//input[contains(@formcontrolname, 'name')]");



private By Amount = By.xpath("//input[contains(@formcontrolname, 'amount')]");

private By CashInDoneButton = By.xpath("/html/body/div[1]/div[5]/div/mat-dialog-container/div/div/app-update-cash/div/div[2]/div[2]/button");







	
	public void CashIn() throws InterruptedException {
		clickOnElement(CashIn, "Cash In ", 10);
		Thread.sleep(2000);

	}  

	public void name1(String cashiername) throws InterruptedException {
		enterTextInTextbox(Name, "user name", cashiername, 10);
	}

	public void amount(String amount) throws InterruptedException {
		enterTextInTextbox(Amount, "amount", amount, 10); 
		
	}     
	public void CashInDoneButton() throws InterruptedException {
		clickOnElement(CashInDoneButton, "Cash In Done button", 10);   
		Thread.sleep(2000);

	}
}