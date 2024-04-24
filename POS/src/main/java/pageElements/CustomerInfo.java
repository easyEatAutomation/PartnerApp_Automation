package pageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import WebBase.WebBase;

public class CustomerInfo extends WebBase {
	
	public static WebDriver driver;
	
	private By AddCustomerDetails = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[1]/div/div[2]/span[1]");
	private By DialCode91 = By.xpath("//*[@id=\"new-order-details-id\"]/div/div/div/form/div[1]/div/nz-form-item[1]/nz-form-control/div/span/input");
	private By MobileNumber = By.xpath("//*[@id=\"number\"]");
	private By SaveButton = By.xpath("//*[@id=\"new-order-details-id\"]/div/div/button");
	private By CustomerInfoSaveButton = By.xpath("/html/body/app-root/body/div/div[2]/div/app-pos-order/section/div/app-cart/div/div[1]/div[2]");
	private By GrabCustomerInfo = By.xpath("/html/body/app-root/body/div/div[2]/div/app-pos-order/section/div/app-cart/div/div[1]/div[3]");
	

	public void AddCustomerDetails () throws InterruptedException {
		clickOnElement(AddCustomerDetails, "Clicked on Add Customer Details", 3000);
		Thread.sleep(2000);

	}
	
	
	public void DialCode(String DialCode) throws InterruptedException {

		enterTextInTextbox(DialCode91, "Entered Dial Code", DialCode, 10);
		Thread.sleep(2000);

	}

	public void MobileNumber(String MobNumber) throws InterruptedException {

		enterTextInTextbox(MobileNumber, "Entered Mobile Number", MobNumber, 10);
		Thread.sleep(2000);

	}
	
	public void SaveButton () {
		
	
	clickOnElement(SaveButton, "Clicked on SaveButton", 1000);
		

	}
	
	
	public void CustomerInfoSaveButton () throws InterruptedException {
		clickOnElement(CustomerInfoSaveButton, "Customer Info Save Button", 3000);
		Thread.sleep(2000);
	
	
	}
	public void GrabCustomerInfo () throws InterruptedException {
		clickOnElement(GrabCustomerInfo, "GrabCustomerInfo", 3000);{
			
		}
			
		}
	
	
}

