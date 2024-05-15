package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class CompleteMergeBillOrder extends WebBase {

	public static WebDriver driver;
	
	
private By selectFirstCheckBox = By.xpath ("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[1]/app-order-left/div[2]/div[1]/div/div[1]/label/span[1]/input");
private By selectSecondCheckBox = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[1]/app-order-left/div[2]/div[2]/div/div[1]/label/span[1]/input");
private By ClickOnMergeBill = By.xpath ("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/app-header/div/div[2]/button[1]");
private By SelectMasterCardForSwipe = By.xpath ("//*[@id=\"mat-dialog-5\"]/app-order-details/div[1]/div[2]/app-payment-options/div/nz-spin/div/div/div[3]");
private By MergeBillSwipeComplete = By.xpath("//*[@id=\"mat-dialog-5\"]/app-order-details/div[1]/div[3]/div[1]/mat-slider/div/div[3]/div[2]");
private By mergecloseIcon = By.xpath("//*[@id=\"mat-dialog-5\"]/app-order-details/div[1]/div[1]/div[2]");

                                      
public void selectFirstCheckBox() throws InterruptedException {
	clickOnElement(selectFirstCheckBox, "select First Check Box", 10);
}
public void selectSecondCheckBox() throws InterruptedException {
	clickOnElement(selectSecondCheckBox, "select Second Check Box", 10);
	Thread.sleep(1000);
}

public void ClickOnMergeBill() throws InterruptedException {
	clickOnElement(ClickOnMergeBill, "Click On Merge Bill", 10);
	Thread.sleep(2000);
}
public void SelectMasterCardForSwipe() throws InterruptedException {
	clickOnElement(SelectMasterCardForSwipe, "Select Master Card For Swipe", 10);
	Thread.sleep(2000);
}
public void MergeBillSwipeComplete () throws InterruptedException{
	moveSlider(MergeBillSwipeComplete, 900, 0);
	Thread.sleep(2000);

}

public void mergecloseIcon() throws InterruptedException {
	clickOnElement(mergecloseIcon, "closeMergePopup", 10);
}
}