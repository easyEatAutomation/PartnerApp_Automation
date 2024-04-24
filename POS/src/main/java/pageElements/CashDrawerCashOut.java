package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class CashDrawerCashOut extends WebBase {

	public static WebDriver driver;
	
private By CashOut = By.xpath ("//*[@id=\"mat-dialog-1\"]/app-open-drawer/div/div[2]/div/div/div[3]/p");
private By NameOut = By.xpath ("//*[@id=\"mat-dialog-2\"]/app-update-cash/div/div[2]/form/div/div[1]/input");	
private By AmountOut = By.xpath ("//*[@id=\"mat-dialog-2\"]/app-update-cash/div/div[2]/form/div/div[2]/div[1]/input");
private By CashOutDoneButton = By.xpath ("//*[@id=\"mat-dialog-2\"]/app-update-cash/div/div[2]/div[2]/button");
	
	
	
	
	public void CashOut() throws InterruptedException {
		clickOnElement(CashOut, "Cash Out ", 10);

	}  

	public void nameOut(String nameOut) throws InterruptedException {
		enterTextInTextbox(NameOut,"nameOut", nameOut, 100);
		Thread.sleep(2000);
	}

	public void amountOut(String amountOut) throws InterruptedException {
		enterTextInTextbox(AmountOut, "amountOut", amountOut, 10);  
	}     
	public void CashOutDoneButton() throws InterruptedException {
		clickOnElement(CashOutDoneButton, "Cash Out Done Button", 10);   

	}
}	