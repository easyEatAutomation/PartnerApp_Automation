package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.devtools.css.CSS;

import WebBase.WebBase;

public class POSPrint extends WebBase {

	public static WebDriver driver;
	
	
private By RunningOrderDashboardPrintButton = By.xpath ("/html/body/app-root/body/div/div/div[2]/app-order/div/div[2]/div[3]/app-order-right/div/div[3]/div[2]/button[1]");
private By CounterPrintButton = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-print-orderdetails/div[1]/div[2]/div/div/div/div/div/div");
private By PrintFinalBillRecipt = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-print-orderdetails/div[1]/div[4]/div[1]");
private By ClosePopUp = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-print-orderdetails/div[1]/div[1]/div[2]/img");
//Select the button by its text content using XPath
private By PastprintButton = By.xpath("//button[contains(., 'PRINT')]");
private By PastBillPrintButton = By.xpath("//*[@id=\"mat-mdc-dialog-0\"]/div/div/app-print-orderdetails/div[1]/div[3]/div[1]");
private By ClosePopUppastOrder = By.xpath ("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-print-orderdetails/div[1]/div[1]/div[2]/img");
private By CounterPrintButton1 = By.xpath("//*[@id=\"print_order\"]");
private By PrintFinalBillReciptAddItem = By.xpath("//*[@id=\"mat-dialog-7\"]/app-print-orderdetails/div[1]/div[4]/div");
private By ClosePopUpAddItems = By.xpath("/html/body/div[1]/div[3]/div/mat-dialog-container/div/div/app-print-orderdetails/div[1]/div[1]/div[2]/img");
private By printMergeBill = By.className("print-text");
private By closemergepop = By.className("cross");


public void RunningOrderDashboardPrintButton() throws InterruptedException {
	clickOnElement(RunningOrderDashboardPrintButton, "Running Order Dashboard Print Button", 10);

}

public void CounterPrintButton() throws InterruptedException {
	clickOnElement(CounterPrintButton, "Counter Print Button", 10);
	Thread.sleep(1000);

}
public void PrintFinalBillRecipt() throws InterruptedException {
	clickOnElement(PrintFinalBillRecipt, "Print Final Bill Recipt", 10);
	Thread.sleep(1000);

}

public void printclosepopup()throws InterruptedException {
	clickOnElement(ClosePopUp, "Click on Close icon on pop up", 10);
	Thread.sleep(1000);
}


public void PastprintButton () throws InterruptedException {
	clickOnElement(PastprintButton, "Past print Button", 10);

}
public void PastBillPrintButton () throws InterruptedException {
	clickOnElement(PastBillPrintButton, "PastBillPrintButton", 10);

}
public void ClosePrintPopupPastOrder ()throws InterruptedException {
	clickOnElement(ClosePopUppastOrder, "Close print Pop Up past Order", 10);
	Thread.sleep(1000);
}
public void CounterPrintButton1() throws InterruptedException {
	clickOnElement(CounterPrintButton1, "Counter Print Button1", 10);
	Thread.sleep(1000);
}

public void PrintFinalBillReciptAddItem() throws InterruptedException {
	clickOnElement(PrintFinalBillReciptAddItem, "Print Final Bill Recipt", 10);
	Thread.sleep(1000);

}

public void ClosePopUpAddItems() throws InterruptedException {
	clickOnElement(ClosePopUpAddItems, "ClosePopUpAddItems", 10);
	Thread.sleep(1000);
}
public void mergeprintbutton () throws InterruptedException {
	clickOnElement(printMergeBill, "printMergeBill", 10);
	Thread.sleep(1000);


}

public void closemergepop()throws InterruptedException {
 
	clickOnElement(closemergepop, "closemergepop", 10);
 }
}
