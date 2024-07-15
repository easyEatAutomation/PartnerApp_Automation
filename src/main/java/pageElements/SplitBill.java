package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import WebBase.WebBase;

public class SplitBill extends WebBase {
	
	 //private WebDriver driver;
	//public static WebDriver driver;
	
	
private By SelectSecondItem = By.xpath ("//*[@id=\"5b971cc9d2ac4dd283e9e876e8ecc3ba\"]/div[1]");
private By ClickOnSplitBill = By.xpath("/html/body/app-root/body/div/div/div/app-settle/div/div/app-payment-method/div[2]/div/button[1]");
private By RightClickForSplit = By.xpath("//*[@id=\"split-cart-0\"]/div[2]/div[2]/div/div[2]/i");                                       
private By AfetrSplitSaveButton = By.xpath("/html/body/app-root/body/div/div[2]/div/app-split-bill/section/div[1]/div/div[2]/button[1]");
private By SplitSettleButton = By.xpath("//*[@id=\"split-cart-0\"]/div[2]/div[4]/div[2]/button");
private By saveButton = By.xpath("/html/body/app-root/body/div/div/div/app-split-bill/section/div[1]/div/div[2]/button[1]");
private By SettleBill1st = By.xpath("/html/body/app-root/body/div/div/div/app-split-bill/section/div[2]/nz-spin/div/div[1]/app-split-bill-card/div/div[2]/div[4]/div[2]/button");
private By visaCard1 = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-order-details/div[1]/div[2]/app-payment-options/div/nz-spin/div/div/div[3]");
private By swipefor1st = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-order-details/div[1]/div[3]/button[2]");
private By cashCard2 = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-order-details/div[1]/div[2]/app-payment-options/div/nz-spin/div/div/div[1]");
private By swpiefor2nd = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-order-details/div[1]/div[3]/button[2]");
private By SettleBill2nd = By.xpath("/html/body/app-root/body/div/div/div/app-split-bill/section/div[2]/nz-spin/div/div[2]/app-split-bill-card/div/div[2]/div[4]/div[2]/button");
private By closeIcon = By.xpath("/html/body/app-root/body/div/div/div/app-split-bill/section/div[1]/div/div[2]/button[2]/img");
private By doneButton = By.xpath("/html/body/app-root/body/div/div/div/app-settle/div/app-cart/div/div[3]/div/div");




public void SelectSecondItem() throws InterruptedException {
	clickOnElement(SelectSecondItem, "Select Second Item", 10);

}
public void ClickOnSplitBill() throws InterruptedException {
	clickOnElement(ClickOnSplitBill, "Click On Split Bill", 10);
	Thread.sleep(3000);

}

public void RightClickForSplit() throws InterruptedException {
clickOnElement(RightClickForSplit, "RightClickForSplit", 10);
Thread.sleep(1000);

}



public void AfetrSplitSaveButton() throws InterruptedException {
	clickOnElement(AfetrSplitSaveButton, "Afetr Split Save Button", 10);

	
}
public void SplitSettleButton() throws InterruptedException {
	clickOnElement(SplitSettleButton, "Split Settle Button", 10);

}
public void saveButton()throws InterruptedException {
	clickOnElement(saveButton, "save Button", 10);
	Thread.sleep(1500);

}
public void SettleBill1st()throws InterruptedException {
	clickOnElement(SettleBill1st, "SettleBill1st", 10);
	Thread.sleep(1500);
	
}

public void clickVisaCard()throws InterruptedException {
	clickOnElement(visaCard1, "Select visa Card", 10);
}
 
public void swipefor1st( ) throws InterruptedException {
	clickOnElement(swipefor1st, "collect 1st payment", 10);
	Thread.sleep(1500);

}
public void clickVisaCard1()throws InterruptedException {
	clickOnElement(cashCard2, "Select visa Card", 10);
}
 
public void swipefor2nd( ) throws InterruptedException {
	clickOnElement(swpiefor2nd, "collect 2nd payment", 10);
	Thread.sleep(1500);

}


public void SettleBill2nd()throws InterruptedException {
	clickOnElement(SettleBill2nd, "SettleBill2nd", 10);
	Thread.sleep(1000);

}
	public void closeIcon()throws InterruptedException {
		clickOnElement(closeIcon, "click on close icon", 10);
		Thread.sleep(1000);

	}

	
public void doneButton()throws InterruptedException {
	clickOnElement(doneButton, "doneButton", 10);
	
}	
	
}