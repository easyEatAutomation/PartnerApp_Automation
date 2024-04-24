package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class CashDrawerCloseCashier extends WebBase {

	public static WebDriver driver;
	
	
	
	private By Closecashier = By.xpath("//*[@id=\"mat-dialog-1\"]/app-open-drawer/div/div[2]/div/div/div[1]/p");
	private By CashierDonebutton = By.xpath("//*[@id=\"mat-dialog-4\"]/app-cashier-confirmation/div/div[2]/div[3]/div[2]/div[2]/button");
	                                         //*[@id="mat-dialog-4"]/app-cashier-confirmation/div/div[2]/div[3]/div[2]/div[2]/button
	
	
	public void Opencashier() throws InterruptedException {
		clickOnElement(Closecashier, "Close cashier", 10);

	}  

	
	public void donebutton() throws InterruptedException {
		clickOnElement(CashierDonebutton, "Cashier Done button", 10);   


	}
	
}