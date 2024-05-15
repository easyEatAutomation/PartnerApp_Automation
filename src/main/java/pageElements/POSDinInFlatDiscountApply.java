package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class POSDinInFlatDiscountApply extends WebBase {

	public static WebDriver driver;
	
	
private By ClickOneditAmount = By.xpath ("/html/body/app-root/body/div/div[2]/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[5]/div[6]/div");
private By SelectFlatDiscount = By.xpath("//*[@id=\"mat-dialog-2\"]/app-add-discount/div/nz-tabset/div[2]/div[1]/div[1]/div/div[2]");
private By ClickApplyDiscounButton = By.xpath ("//*[@id=\"mat-dialog-2\"]/app-add-discount/div/div[2]/button");
		


public void ClickOneditAmount() throws InterruptedException {
	clickOnElement(ClickOneditAmount, "Click On edit Amount", 10);
}
public void SelectFlatDiscount() throws InterruptedException {
	clickOnElement(SelectFlatDiscount, "Select Flat Discount", 10);
}
public void ClickApplyDiscounButton() throws InterruptedException {
	clickOnElement(ClickApplyDiscounButton, "Click Apply Discoun Button", 10);
}

}