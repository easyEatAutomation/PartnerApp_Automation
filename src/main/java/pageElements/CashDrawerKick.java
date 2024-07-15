package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class CashDrawerKick extends WebBase {

	public static WebDriver driver;
	
	
private By DrawerKick = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-open-drawer/div/div[2]/div/div/div[4]");
private By NameKick = By.xpath("//input[contains(@formcontrolname, 'name')]");
private By DoneDrawerKick = By.xpath("/html/body/div[1]/div[5]/div/mat-dialog-container/div/div/app-drawer-kick/div/div[2]/div[2]/button");
//Single DoneDrawerKick Feature file //*[@id=\"mat-dialog-2\"]/app-drawer-kick/div/div[2]/div[2]/button");



	
	public void DrawerKick() throws InterruptedException {
		clickOnElement(DrawerKick, "Drawer Kick ", 10);
		Thread.sleep(1000);

	}  

	public void nameKick(String nameKick) throws InterruptedException {
		enterTextInTextbox(NameKick, "Name Kick", nameKick, 10);
	}

	public void DoneDrawerKick() throws InterruptedException {
		clickOnElement(DoneDrawerKick, "Done Drawer Kick ", 10);
		Thread.sleep(2000);

	} 
	
}