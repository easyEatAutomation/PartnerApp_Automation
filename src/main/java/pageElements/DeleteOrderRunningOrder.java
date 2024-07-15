package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class DeleteOrderRunningOrder extends WebBase {

	public static WebDriver driver;
	
	
private By DeleteButtonRunningOrder = By.xpath ("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[2]/div[6]/div");
private By YesDeleteInRunning = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-delete-created-order/div/div[2]/button[2]");




public void DeleteButtonRunningOrder() throws InterruptedException {
	clickOnElement(DeleteButtonRunningOrder, "Delete Button Running Order", 10);
	Thread.sleep(2000);

}

public void YesDeleteInRunning() throws InterruptedException {
	clickOnElement(YesDeleteInRunning, "Yes Delete In Running", 10);

}
}