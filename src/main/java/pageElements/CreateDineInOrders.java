package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import WebBase.WebBase;

public class CreateDineInOrders extends WebBase {

	
public static WebDriver driver;

private By AutomateSMS = By.xpath("//*[@id=\"mat-dialog-0\"]/app-new-feature-ad/div/img[1]");
private By CreateOrderButton = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/app-header/div/div[2]/button[2]");
private By DineIn = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div/div[1]");
private By ItemNameA = By.xpath("//*[@id=\"5b971cc9d2ac4dd283e9e876e8ecc3ba\"]/div[2]/div/div[1]/img");
private By ItemNameB = By.xpath("//*[@id=\"5b971cc9d2ac4dd283e9e876e8ecc3ba\"]/div[3]");
private By ItemName = By.xpath ("//*[@id=\"5b971cc9d2ac4dd283e9e876e8ecc3ba\"]/div[2]/div/div[1]/img");
private By CreateOrder = By.xpath("/html/body/app-root/body/div/div[2]/div/app-pos-order/section/div/app-cart/div/div[3]/div[2]/button[1]");
private By selectTable = By.xpath("//*[@id=\"new-order-details-id\"]/div/div/div/button[4]"); 
private By VoidIcon = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[3]/div/div[2]/img");
private By VoidDish = By.xpath("//*[contains(@id, 'mat-dialog')]/app-void-dish/div/div[3]/button");
								  // ("//*[@id=\"mat-dialog-9\"]/app-void-dish/div/div[3]/button")
	private By AddItems = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[1]/button[1]");
	private By SettleBillOnDineIn = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[1]/button[2]");
	private By DineInCashPayment = By.xpath("/html/body/app-root/body/div/div[2]/div/app-settle/div/div/app-payment-method/div[3]/div/button[2]");
	private By CompleteOrder = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[2]/button[2]");
									//("//*[@id=\"mat-dialog-14\"]/app-payment-pending/div/div[2]/app-payment-options/div/nz-spin/div/div/div[2]")
	private By SelectCash = By.xpath("//*[contains(@id, 'mat-dialog')]/app-payment-pending/div/div[2]/app-payment-options/div/nz-spin/div/div/div[2]");
									//("//*[@id=\"mat-dialog-12\"]/app-payment-pending/div/div[2]/app-payment-options/div/nz-spin/div/div/div[2]")
									
	private By SwipeComplete = By.xpath("//app-payment-pending/div/div/mat-slider/div/div[3]/div[2]");
										//("//*[@id=\"mat-dialog-15\"]/app-payment-pending/div/div[3]/mat-slider/div/div[3]/div[2]");	
	private By tableChangeButton = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[1]/div[1]/div/div[2]/div");
	private By TableNumber = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div/div/button[2]");
	private By TransferTableButton = By.xpath("//*[@id=\"new-order-details-id\"]/div[2]/button");
	private By DeleteOrderLink = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[6]/div");
	private By DeleteConfirmationButton = By.xpath("//button[contains(@id, 'cdk-overlay')]");
	private By DeleteOrderConfirmationButton = By.xpath("//app-delete-created-order//button[contains(text(),'Yes, Delete')]");
	//*[@id="mat-dialog-25"]/app-delete-created-order/div/div[2]/button[2]
	//*[@id="mat-dialog-3"]/app-delete-created-order/div/div[2]/button[2]
	//*[@id="mat-dialog-21"]/app-delete-created-order/div/div[2]/button[2]
                                                 // ("//*[@id=\"cdk-overlay-15\"]/nz-modal/div/div[2]/div/div/div/app-delete-payment/nz-result/div[4]/div/button[2]")
	private By PaymentChangeLink = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[12]/div/div[2]");
											//("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[12]/div/div[2]");	
	private By PaymentDeleteLink = By.xpath("/html/body/app-root/body/div/div[2]/div/app-settle/div/div/app-payment-method/div[2]/nz-table/nz-spin/div/div/div/div/table/tbody/tr/td[3]/span");
	private By Deletebuttonconfirmation = By.xpath("//div[contains(@id, 'cdk-overlay')]/nz-modal/div/div[2]/div/div/div/app-delete-payment/nz-result/div[4]/div/button[2]");
	private By SelectMasterCard = By.xpath("/html/body/app-root/body/div/div[2]/div/app-settle/div/div/app-payment-method/div[3]/div/button[3]");
	private By PayRMbuttononPopup = By.xpath("//*[@id=\"new-order-details-id\"]/div[2]/button");
	private By DoneButton = By.xpath("/html/body/app-root/body/div/div[2]/div/app-settle/div/app-cart/div/div[3]/div/div");
	private By getInvoice = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[1]/div/div[2]/span[2]/span");
	private By SearchInvoice = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[1]/app-order-left/div[1]/div/div[2]/nz-input-group/input");
	
	
	


	

public void performAction() throws InterruptedException {
	if (AutomateSMS()) {
		// If AutomateSMS was successful, do nothing else.
	} else {
		CreateOrderButton();
	}
}

public boolean AutomateSMS() throws InterruptedException {
	// Attempt to click AutomateSMS
	clickOnElement(AutomateSMS, "Automate SMS", 1000);
	// Assuming clickOnElement sets some flag to indicate success
	// Replace this with your actual logic if available
	return true; // Return true always as the click was attempted
}


	public void CreateOrderButton() throws InterruptedException {
clickOnElement(CreateOrderButton, "Clicked on Create Order", 10);
	Thread.sleep(1000);
	}


		
		public void DineIn() throws InterruptedException {

			clickOnElement(DineIn, "Clicked on Dine In Button", 10);
			Thread.sleep(3000);

		}
		
		
		public void ItemNameA() throws InterruptedException {

			clickOnElement(ItemNameA, "Selected ItemA", 10);
		Thread.sleep(1000);


	}

	public void ItemNameB() throws InterruptedException {
		clickOnElement(ItemNameB, "Selected ItemB", 10);
		Thread.sleep(1000);
		}

		public void ItemName() throws InterruptedException {

			clickOnElement(ItemName, "Item Name", 10);
			Thread.sleep(1000);

		}
		

		public void CreateOrder() throws InterruptedException {

			clickOnElement(CreateOrder, "Clicked on Create Order button on Cart screen", 10);
			
	}
		
		public void selectTable() throws InterruptedException {

			clickOnElement(selectTable, " DineIn Table Selected for order completion", 10);
			Thread.sleep(3000);

					

		}
		
		public void VoidIcon() throws InterruptedException {
			clickOnElement(VoidIcon, "Clicked on Void Icon", 10);
		Thread.sleep(2000);

		}
		
		public void VoidDish() throws InterruptedException {
			clickOnElement(VoidDish, "Clicked on Void Dish", 10);
			
		}

	public void AddItems() throws InterruptedException {
		clickOnElement(AddItems, "Items Added Into cart", 10);
		Thread.sleep(1000);
	}

	public void SettleBillOnDineIn() throws InterruptedException
	{
		clickOnElement(SettleBillOnDineIn, "Clicked on Settle Bill On DineIn", 10);
		Thread.sleep(7000);

	}

	public void DineInCashPayment() throws InterruptedException
	{
		clickOnElement(DineInCashPayment, "Selected CashPayment Option", 10);

	}


	public void CompleteOrder()throws InterruptedException{
		clickOnElement(CompleteOrder, "Clicked on CompleteOrder button", 10);
		Thread.sleep(3000);
	}

	public void SelectCash()throws InterruptedException{
		clickOnElement(SelectCash, "Select Cash", 10);
		Thread.sleep(2000);

	}


	public void SwipeComplete () throws InterruptedException{
		moveSlider(SwipeComplete, 900, 0);
		Thread.sleep(2000);

	}

	public void tableChangeButton ()throws InterruptedException{
		clickOnElement(tableChangeButton, "Clicked on Table Change Button", 1000);
	}

	public void TableNumber ()throws InterruptedException{
		clickOnElement(TableNumber, "Clicked on Table Number", 1000);
	}
	public void TransferTableButton ()throws InterruptedException{
		clickOnElement(TransferTableButton, "Clicked on Transfer Table Button", 1000);
	}
	
	public void DeleteOrderLink() throws InterruptedException{
		clickOnElement(DeleteOrderLink, "Clicked on Delete Order Link", 1000);
		Thread.sleep(2000);

		
	}
	public void DeleteConfirmationButton() throws InterruptedException{
		clickOnElement(DeleteConfirmationButton, "Clicked on Delete Confirmation Button", 1000);
		Thread.sleep(7000);

	}
	
	
	public void PaymentChangeLink() throws InterruptedException {
		clickOnElement(PaymentChangeLink, "PaymentChangeLink", 10);
		Thread.sleep(1500);

	}
	
	
	public void PaymentDeleteLink() throws InterruptedException {
		clickOnElement(PaymentDeleteLink, "PaymentDeleteLink", 10);
		Thread.sleep(3000);

	}
	
	
	public void Deletebuttonconfirmation()throws InterruptedException {
		clickOnElement(Deletebuttonconfirmation, "Deletebuttonconfirmation", 10);
		Thread.sleep(2000);

	
	}
	public void SelectMasterCard()throws InterruptedException {
		clickOnElement(SelectMasterCard, "SelectMasterCard", 10);
		Thread.sleep(2000);

		
}
	public void PayRMbuttononPopup()throws InterruptedException {
		clickOnElement(PayRMbuttononPopup, "PayRMbuttononPopup", 10);
	

	}
	
	public void DoneButton()throws InterruptedException {
		clickOnElement(DoneButton, "DoneButton", 10);
		Thread.sleep(3000);

		
	}
	
	public String getInvoice()throws InterruptedException {
		return getText(getInvoice);
}
	public void SearchInvoice(String Invoice)throws InterruptedException {
		enterTextInTextbox(SearchInvoice, "Search Invoice", Invoice, 10);
		
	}
	public void DeleteOrderConfirmationButton()throws InterruptedException {
 	clickOnElement(DeleteOrderConfirmationButton, "DeleteOrderConfirmationButton", 100);
	}
}
