package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class SplitBill extends WebBase {

	public static WebDriver driver;
	
	
private By SelectSecondItem = By.xpath ("//*[@id=\"5b971cc9d2ac4dd283e9e876e8ecc3ba\"]/div[1]");
private By ClickOnSplitBill = By.xpath("/html/body/app-root/body/div/div[2]/div/app-settle/div/div/app-payment-method/div[2]/div/button[1]");
private By RightClickForSplit = By.xpath("//*[@id=\"split-cart-0\"]/div[2]/div[2]/div/div[1]");
private By AfetrSplitSaveButton = By.xpath("/html/body/app-root/body/div/div[2]/div/app-split-bill/section/div[1]/div/div[2]/button[1]");
private By SplitSettleButton = By.xpath("//*[@id=\"split-cart-0\"]/div[2]/div[4]/div[2]/button");



public void SelectSecondItem() throws InterruptedException {
	clickOnElement(SelectSecondItem, "Select Second Item", 10);

}
public void ClickOnSplitBill() throws InterruptedException {
	clickOnElement(ClickOnSplitBill, "Click On Split Bill", 10);
	Thread.sleep(2000);

}

public void RightClickForSplit() throws InterruptedException {
	clickOnElement(RightClickForSplit, "Right Click For Split", 10);

}

public void AfetrSplitSaveButton() throws InterruptedException {
	clickOnElement(AfetrSplitSaveButton, "Afetr Split Save Button", 10);

}
public void SplitSettleButton() throws InterruptedException {
	clickOnElement(SplitSettleButton, "Split Settle Button", 10);

}

}