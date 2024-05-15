package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebBase.WebBase;
import io.cucumber.java.en.When;

public class OtherOptions extends WebBase  {
	

		public static WebDriver driver;

		private By OtherOrderType = By.xpath("//*[@id=\"new-order-details-id\"]/div[1]/div/div[3]");
		
		

		public void OtherOrderType () throws InterruptedException {

			clickOnElement(OtherOrderType, "Other Order Type from Pop up", 10000);
}
}