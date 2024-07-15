package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class CashDrawerCashOut extends WebBase {

	public static WebDriver driver;
	
	private By CashOut = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-open-drawer/div/div[2]/div/div/div[3]");


                                 
//div[contains(@id, 'mat-dialog')]/app-open-drawer/div/div[2]/div/div/div[3]
private By NameOut = By.xpath("//input[contains(@formcontrolname, 'name')]");
                              
private By AmountOut = By.xpath ("//input[contains(@formcontrolname, 'amount')]");
private By CashOutDoneButton = By.xpath ("/html/body/div[1]/div[5]/div/mat-dialog-container/div/div/app-update-cash/div/div[2]/div[2]/button");
	
	
	
	
	public void CashOut() throws InterruptedException {
		clickOnElement(CashOut, "Cash Out ", 10);
		Thread.sleep(1000);

	}  

	public void nameOut(String nameOut) throws InterruptedException {
		enterTextInTextbox(NameOut,"nameOut", nameOut, 10);
		Thread.sleep(2000);
	}

	public void amountOut(String amountOut) throws InterruptedException {
		enterTextInTextbox(AmountOut, "amountOut", amountOut, 10);  
	}     
	public void CashOutDoneButton() throws InterruptedException {
		clickOnElement(CashOutDoneButton, "Cash Out Done Button", 10);   
		Thread.sleep(2000);

	}
}	