package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import WebBase.WebBase;

public class CustomerInfo extends WebBase {
	
	public static WebDriver driver;
	
	private By AddCustomerDetails = By.xpath("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[1]/div/div[2]/span[1]");
	private By DialCode91 = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-cart-modal/div/div[2]/div/div/div/div/div/form/div[1]/div/nz-form-item[1]/nz-form-control/div/div/input");
	private By MobileNumber = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-cart-modal/div/div[2]/div/div/div/div/div/form/div[1]/div/nz-form-item[2]/nz-form-control/div/div/nz-input-group/input");
	private By SaveButton = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-cart-modal/div/div[2]/div/div/div/div/button");
	private By CustomerInfoSaveButton = By.xpath("/html/body/app-root/body/div/div/div/app-pos-order/section/div/app-cart/div/div[1]/div[2]/span");
	private By GrabCustomerInfo = By.xpath("/html/body/app-root/body/div/div/div/app-pos-order/section/div/app-cart/div/div[1]/div[3]/span");
	

	public void AddCustomerDetails () throws InterruptedException {
		clickOnElement(AddCustomerDetails, "Clicked on Add Customer Details", 10);
		Thread.sleep(2000);

	}
	
	
	public void DialCode(String DialCode) throws InterruptedException {

		enterTextInTextbox(DialCode91, "Entered Dial Code", DialCode, 10);
		Thread.sleep(1500);

	}

	public void MobileNumber(String MobNumber) throws InterruptedException {

		enterTextInTextbox(MobileNumber, "Entered Mobile Number", MobNumber, 10);
		Thread.sleep(1500);

	}
	
	public void SaveButton () throws InterruptedException {
		
	
	clickOnElement(SaveButton, "Clicked on SaveButton", 10);
	Thread.sleep(1500);


	}
	
	
	public void CustomerInfoSaveButton () throws InterruptedException {
		clickOnElement(CustomerInfoSaveButton, "Customer Info Save Button", 10);
		Thread.sleep(1500);
	
	
	}
	public void GrabCustomerInfo () throws InterruptedException {
		clickOnElement(GrabCustomerInfo, "GrabCustomerInfo", 10);{
			Thread.sleep(1500);

		}
			
		}
	
	
}

