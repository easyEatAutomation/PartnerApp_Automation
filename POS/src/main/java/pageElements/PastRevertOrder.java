package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class PastRevertOrder extends WebBase {

	public static WebDriver driver;
	
	
private By pastrevertSelectItem = By.xpath ("//*[@id=\"mat-dialog-1\"]/app-open-drawer/div/div[2]/div/div/div[2]");
private By SettleButtonDashboard = By.xpath ("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[1]/button[2]"); 
private By SelcectMasterCard = By.xpath("/html/body/app-root/body/div/div[2]/div/app-settle/div/div/app-payment-method/div[3]/div/button[3]/img");                                     
private By MasterPaidByMasterCard = By.xpath("//*[@id=\"new-order-details-id\"]/div[2]/button");
private By FinalPaidDoneButton = By.xpath ("/html/body/app-root/body/div/div[2]/div/app-settle/div/app-cart/div/div[3]/div/div");
private By CompleteOrder = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[2]/button[2]");
private By ClickOnPast = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[1]/nz-tabset/div[1]/div/div/div/div/div[1]/div[2]");
private By PastRevertButton = By.xpath("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div/button[1]");
private By Revert = By.xpath("//*[@id=\"mat-dialog-3\"]/app-revert-order/div/div[2]/button[2]");
                             


public void pastrevertSelectItem() throws InterruptedException {
	clickOnElement(pastrevertSelectItem, "past revert Select Item", 10);

} 

public void SettleButtonDashboard() throws InterruptedException {
	clickOnElement(SettleButtonDashboard, "Settle Button Dashboard", 7000);
	Thread.sleep(7000);


}
public void SelcectMasterCard() throws InterruptedException {
	clickOnElement(SelcectMasterCard, "Selcect Master Card", 7000);
	Thread.sleep(7000);  
} 
public void MasterPaidByMasterCard() throws InterruptedException {
	clickOnElement(MasterPaidByMasterCard, "Master Paid By Master Card", 10);   

}
public void FinalPaidDoneButton() throws InterruptedException {
	clickOnElement(FinalPaidDoneButton, "Final Paid Done Button", 10);   

}
public void CompleteOrder() throws InterruptedException {
	clickOnElement(CompleteOrder, "Complete Order", 10);   

}

public void ClickOnPast() throws InterruptedException {
	clickOnElement(ClickOnPast, "Click On Past", 10);   

}

public void PastRevertButton() throws InterruptedException {
	clickOnElement(PastRevertButton, "Past Revert Button", 10);   

}

public void Revert() throws InterruptedException {
	clickOnElement(Revert, "Revert", 10);   

}

}