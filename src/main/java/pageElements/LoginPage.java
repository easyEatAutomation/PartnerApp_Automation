package pageElements;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebBase.WebBase;
//import kotlin.jvm.Throws;

public class LoginPage extends WebBase {

	public WebDriver driver;

	private By usernamevalue = By.id("email");
	private By passwordvalue = By.cssSelector("input[type=password]");
	private By loginButton = By.xpath("/html/body/app-root/body/div/div/div/app-login/div/div[1]/div/form/nz-form-item[3]/nz-form-control/div/div/button/span");
	private By login_sucess = By.xpath("//*[@id=\"cdk-overlay-0\"]/nz-message-container/div");
	private By click_one = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[3]/div[3]");
	private By click_two = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[2]/div[2]");
	private By click_three = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[3]/div[2]");
	private By click_four = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[3]/div[2]/div[3]");
	private By click_SignIn = By.xpath("//*[@id=\"cb_right\"]/div[1]/div[4]");

	


	public void enterUsername(String username) {

		enterTextInTextbox(usernamevalue, "Entered Username", username, 10);

	}

	public void enterPassword(String password) {

		enterTextInTextbox(passwordvalue, "Entered Password", password, 10);

	}

	public void loginClick() throws InterruptedException {

		clickOnElement(loginButton, "Cliked on Login Button", 10);

	}

	public void login_successfully() throws InterruptedException {
		Thread.sleep(1000);
		toastmessage(login_sucess, "Login successful", 10);



	}
	public void click_one()throws InterruptedException {

		clickOnElement(click_one, "clicked on one", 10);

	}

	public void click_two()throws InterruptedException {

		clickOnElement(click_two, "clicked on two", 10);

	}
	public void click_three()throws InterruptedException {

		clickOnElement(click_three, "clicked three", 10);

	}
	public void click_four()throws InterruptedException {

		clickOnElement(click_four, "clicked on four", 10);
	}

	public void click_SignIn() throws InterruptedException 
	{
		clickOnElement(click_SignIn, "clicked on Sign In button", 10);



		Thread.sleep(1500);
		//closeBrowser();		

	}




}