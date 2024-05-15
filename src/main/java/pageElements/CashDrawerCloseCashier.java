package pageElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebBase.WebBase;

public class CashDrawerCloseCashier extends WebBase {

	public static WebDriver driver;
	

	private By closeCashier = By.xpath("//*[@id=\"mat-dialog-10\"]/app-open-drawer/div/div[2]/div/div/div[1]");

	
	private By CashierDonebutton = By.xpath("//*[@id=\"mat-dialog-6\"]/app-cashier-confirmation/div/div[2]/div[2]/div/button[2]");
	
	private By cashierConfirmationButton = By.xpath("//*[@id=\"mat-dialog-11\"]/app-cashier-confirmation/div/div[2]/div[2]/div/button[2]");

	private By Donebutton = By.xpath("//*[@id=\"mat-dialog-12\"]/app-update-cashier/div/div/div[3]/button");
	
	private By CashierReportDoneButton1 = By.xpath("//*[@id=\"mat-dialog-13\"]/app-cashier-confirmation/div/div[2]/div[3]/div[2]/div[2]/button");
	
	
	public void Opencashier() throws InterruptedException {
		clickOnElement(closeCashier, "Close cashier", 10);
		Thread.sleep(1000);

	}  

	public void cashierConfirmationButton ()  throws InterruptedException {
			clickOnElement(cashierConfirmationButton, "cashierConfirmationButton", 10);
	
	}
	public void donebutton() throws InterruptedException {
		clickOnElement(CashierDonebutton, "Cashier Done button", 10);   
		Thread.sleep(1000);


	}
	
	public void CashierDonebutton () throws InterruptedException {

		clickOnElement(Donebutton, "Donebutton", 10);   

		Thread.sleep(1000);
	}
	
	public void CashierReportDoneButton() throws InterruptedException {
		clickOnElement(CashierReportDoneButton1, "CashierReportDoneButton", 10);
		Thread.sleep(1000);

	}

	
}