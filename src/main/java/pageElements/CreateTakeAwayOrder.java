package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class CreateTakeAwayOrder extends WebBase {
	
	public static WebDriver driver;

	
	private By CreateOrderButton = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/app-header/div/div[2]/button[2]");
	private By TakeAwayButton = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div/div[2]");
	private By ItemName = By.xpath("//*[@id=\"5b971cc9d2ac4dd283e9e876e8ecc3ba\"]/div[2]/div/div[1]/img");
	private By SettleBill = By.xpath("/html/body/app-root/body/div/div/div/app-pos-order/section/div/app-cart/div/div[3]/div[2]/button");
	private By Cash = By.xpath("/html/body/app-root/body/div/div/div/app-settle/div/div/app-payment-method/div[3]/div/button[2]");
	private By enterAmount = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div[1]/button[2]");
	private By nextButton = By.xpath("//*[@id=\"new-order-details-id\"]/div[2]/div/button");
	private By pendingAmountDoneButton = By.xpath("//*[@id=\"new-order-details-id\"]/div[2]/button[2]");
	private By DoneButtonBillingPage = By.xpath("/html/body/app-root/body/div/div/div/app-settle/div/app-cart/div/div[3]/div");
    private By CompleteTakeAwayOrer = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[2]/button[2]");
	private By PastOrderTab = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[1]/nz-tabset/nz-tabs-nav/div/div/div[2]/div");
	private By RevertOrderButton = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div/button[1]/span");
	private By YesDeleteButton = By.xpath ("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-revert-order/div/div[2]/button[2]");

	public void CreateOrderButton() throws InterruptedException {

		clickOnElement(CreateOrderButton, "Clicked on Create Order for Take Away Order Type", 100);
		//Thread.sleep(3000);
	}
	
		public void TakeAwayButton () throws InterruptedException {

			clickOnElement(TakeAwayButton, "Clicked on Take Away button", 10);
			Thread.sleep(2000);
		}
		
		public void ItemName() throws InterruptedException {

			clickOnElement(ItemName, "Item Name", 10);
			Thread.sleep(1500);

	}
		public void SettleBill()throws InterruptedException {
						clickOnElement(SettleBill, "Clicked on Settle Bill", 10);
						Thread.sleep(7000);
		

	}
		
		public void Cash()throws InterruptedException {

			clickOnElement(Cash, "Cash Bill", 10);
		}

		public void enterAmount () throws InterruptedException {

			clickOnElement(enterAmount, "Clicked on full Amount", 10);
			Thread.sleep(1500);
		}

		public void nextButton () throws InterruptedException {

			clickOnElement(nextButton, "Clicked on Next Button", 10);

			Thread.sleep(1500);

		}
		public void pendingAmountDoneButton () throws InterruptedException {

			clickOnElement(pendingAmountDoneButton, "Clicked on Pending Amount Done Button", 10);
			Thread.sleep(3000);

		}
		
		public void DoneButtonBillingPage() throws InterruptedException {

			clickOnElement(DoneButtonBillingPage, "Clicked on Done button on Billing Page", 10);
		Thread.sleep(1500);

	}
	
	public void CompleteTakeAwayOrer()throws InterruptedException {

		clickOnElement(CompleteTakeAwayOrer, "Complete Take Away Orer", 10);
		Thread.sleep(1000);

	}
	
	public void PastOrderTab() throws InterruptedException {

		clickOnElement(PastOrderTab, "PastOrderTab", 10);
	}
	
	public void RevertOrderButton() throws InterruptedException {

		clickOnElement(RevertOrderButton, "RevertOrderButton", 10);
		Thread.sleep(1000);

	}
	
	public void YesDeleteButton() throws InterruptedException {

		clickOnElement(YesDeleteButton, "YesDeleteButton", 10);
	}
}

