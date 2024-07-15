package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebBase.WebBase;

public class ApplyDiscount extends WebBase {

	public  WebDriver driver;
	
	
	private By AddAmountLink = By.xpath("/html/body/app-root/body/div/div/div/app-pos-order/section/div/app-cart/div/div[2]/div[3]/div[6]/p[2]");
	private By FlatDiscount = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-add-discount/div/nz-tabset/div/div/div[1]/div[1]/div/div[1]");
	private By ApplyButton = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-add-discount/div/div[2]/button");
	private By SendFlat1RM = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-add-discount/div/nz-tabset/div/div/div[1]/div[1]/div/div[5]/input");
	private By SelectCelebration = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-add-discount/div/nz-tabset/div/div/div[1]/div[2]/div/div[1]");
	private By VerifySelectReason = By.xpath("//div[contains(@id, 'mat-dialog-')]/app-add-discount/div/nz-tabset/div[2]/div[1]/div[2]/label");
	private By ClickOverlay = By.xpath("/html/body/div[1]/div[4]");
	private By PercentageDiscount = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-add-discount/div/nz-tabset/nz-tabs-nav/div/div/div[2]/div");                                   
	private By SendPercentage = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-add-discount/div/nz-tabset/div/div/div[2]/div[1]/div/div[5]/input");
	private By percentage5Discount = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-add-discount/div/nz-tabset/div/div/div[2]/div[1]/div/div[1]");
	private By TopUpTab = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-add-discount/div/nz-tabset/nz-tabs-nav/div/div/div[3]/div");
	private By select10RM = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-add-discount/div/nz-tabset/div/div/div[3]/div[1]/div/div[1]");



	//*[@id="mat-dialog-18"]/app-add-discount/div/nz-tabset/div[2]/div[3]/div[1]/div/div[1]
	private By Send2RMTopup = By.xpath("//input[@placeholder='Enter Topup Value']");




	//*[@id="mat-dialog-5"]/app-add-discount/div/nz-tabset/div[2]/div[3]/div[1]/div/div[5]/input
										 //*[@id="mat-dialog-3"]/app-add-discount/div/nz-tabset/div[2]/div[3]/div[1]/div/div[5]/input
	
	
	
	public void AddAmountLink () throws InterruptedException {
		clickOnElement(AddAmountLink, "AddAmountLink", 10);
		Thread.sleep(2000);

	}
	
	public void FlatDiscount () throws InterruptedException {
		clickOnElement(FlatDiscount, "FlatDiscount", 10);
		Thread.sleep(1000);

	}
	
	public void ApplyButton () throws InterruptedException {
		clickOnElement(ApplyButton, "ApplyButton", 10);
		Thread.sleep(1000);
	}
	
	public void SendFlat1RM(String Send1RM) throws InterruptedException {
		enterTextInTextbox(SendFlat1RM, "Send 1 RM Manually", Send1RM, 10);
		Thread.sleep(1000);

	}
	
	public void SelectCelebration() {
		clickOnElement(SelectCelebration, "SelectCelebration", 10);
	}

	
	public void VerifySelectReason() {
		verifyPage(VerifySelectReason, "SELECT REASON", 10);
	}
	
	public void ClickOverlay() {
		clickOnElement(ClickOverlay, "ClickOverlay", 10);
	}
	
	public void PercentageDiscount () {
		clickOnElement(PercentageDiscount, "PercentageDiscount", 10);

	}
	
		
	
	public void SendPercentage(String SendPercentage3) throws InterruptedException {
		enterTextInTextbox(SendPercentage, "SendPercentage", SendPercentage3, 10);
		Thread.sleep(1000);

	}
	
	public void percentage5Discount() {
		clickOnElement(percentage5Discount, "percentage5Discount", 10);
		
	
	}
	
	public void TopUpTab() throws InterruptedException {
		clickOnElement(TopUpTab, "TopUpTab", 10);
		Thread.sleep(1000);

	}
	public void select10RM() throws InterruptedException {
		clickOnElement(select10RM, "select10RM", 10);
		
}
	public void SendRMTopup(String send2rm) throws InterruptedException {
		enterTextInTextbox(Send2RMTopup, "Send 2RM Topup", send2rm, 10);
		Thread.sleep(1000);
	}

 
	
}