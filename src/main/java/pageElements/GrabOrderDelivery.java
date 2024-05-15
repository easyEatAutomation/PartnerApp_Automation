package pageElements;

import org.openqa.selenium.By;
import WebBase.WebBase;
import org.openqa.selenium.WebDriver;


public class GrabOrderDelivery extends WebBase {
	public static WebDriver driver;
	
	private By GrabIcon = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div/div[4]");
	private By GrabDeliveryIcon = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div/div[1]");
	private By GrabPickupIcon = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div/div[2]");
			
	public void GrabIcon() throws InterruptedException {

		clickOnElement(GrabIcon, "Clicked on Grab Icon from Order Type Pop up", 1000);
	}

	public void GrabDeliveryIcon() throws InterruptedException {

		clickOnElement(GrabDeliveryIcon, "Clicked on Grab Delivery Icon", 1000);
	}
	public void GrabPickupIcon() throws InterruptedException {

		clickOnElement(GrabPickupIcon, "Clicked on Grab PickUp Icon", 1000);
	}

	
}
