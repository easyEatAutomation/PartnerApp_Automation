package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class CashDrawerKick extends WebBase {

	public static WebDriver driver;
	
	
private By DrawerKick = By.xpath ("//*[@id=\"mat-dialog-4\"]/app-open-drawer/div/div[2]/div/div/div[4]/p");
private By NameKick = By.xpath("//*[@id=\"mat-dialog-5\"]/app-drawer-kick/div/div[2]/form/div/div[1]/input");
private By DoneDrawerKick = By.xpath("//*[@id=\"mat-dialog-5\"]/app-drawer-kick/div/div[2]/div[2]/button");


	
	public void DrawerKick() throws InterruptedException {
		clickOnElement(DrawerKick, "Drawer Kick ", 10);

	}  

	public void nameKick(String nameKick) throws InterruptedException {
		enterTextInTextbox(NameKick,"name Kick", nameKick, 100);
		Thread.sleep(2000);
	}

	public void DoneDrawerKick() throws InterruptedException {
		clickOnElement(DoneDrawerKick, "Done Drawer Kick ", 10);

	} 
	
}