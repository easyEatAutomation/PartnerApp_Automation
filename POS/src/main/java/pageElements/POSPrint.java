package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;

public class POSPrint extends WebBase {

	public static WebDriver driver;
	
	
private By RunningOrderDashboardPrintButton = By.xpath ("//*[@id=\"mat-dialog-1\"]/app-open-drawer/div/div[2]/div/div/div[2]");
private By CounterPrintButton = By.xpath("");
private By PrintFinalBillRecipt = By.xpath("");
private By PastprintButton = By.xpath("");
private By PastBillPrintButton = By.xpath("");



public void RunningOrderDashboardPrintButton() throws InterruptedException {
	clickOnElement(RunningOrderDashboardPrintButton, "Running Order Dashboard Print Button", 10);

}

public void CounterPrintButton() throws InterruptedException {
	clickOnElement(CounterPrintButton, "Counter Print Button", 10);

}
public void PrintFinalBillRecipt() throws InterruptedException {
	clickOnElement(PrintFinalBillRecipt, "Print Final Bill Recipt", 10);

}
public void PastprintButton () throws InterruptedException {
	clickOnElement(PastprintButton, "Past print Button", 10);

}
public void PastBillPrintButton () throws InterruptedException {
	clickOnElement(PastBillPrintButton, "PastBillPrintButton", 10);

}

}