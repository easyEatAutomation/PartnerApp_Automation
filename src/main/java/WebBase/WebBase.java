package WebBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pageElements.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.URI;

//Other imports...

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class WebBase {

	protected static WebDriver driver;
	//public static IOSDriver<MobileElement> driver1;
	protected static IOSDriver<MobileElement> driver1;
	


	public static void launchApp() {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "17.5");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad Air 13-inch (M2)");
		caps.setCapability(MobileCapabilityType.UDID, "3C9DC822-7824-484E-A3A3-996C6A9AE80F");
		caps.setCapability(MobileCapabilityType.APP, "/Users/ajai/Downloads/EasyEatPartner 6.app");
		caps.setCapability("automationName", "XCUITest");
		caps.setCapability("wdaStartupRetryInterval", 3000);
		caps.setCapability("showXcodeLog", true);
		caps.setCapability("clearSystemFiles", true);
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("autoAcceptAlerts", true);


		try {
			URI uri = new URI("http://127.0.0.1:4723/");
			driver1 = new IOSDriver<>(uri.toURL(), caps);
			Thread.sleep(3000);

		} catch (URISyntaxException | MalformedURLException e) {
			System.err.println("URL is malformed: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Test failed: " + e.getMessage());
			e.printStackTrace();
		}
	}



	public void createDriver(String browserName) {
		try {
			String osName = System.getProperty("os.name");

			if(osName.toLowerCase().contains("windows".toLowerCase())) {
				if(browserName.toLowerCase().contains("chrome".toLowerCase())) {
					System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");


					//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
					driver = new ChromeDriver();
				} else if(browserName.toLowerCase().contains("Mozilla fire fox".toLowerCase())) {
					System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
					driver = new FirefoxDriver();

				} else {
					System.setProperty("webdriver.msedge.driver","./Drivers/msedgedriver.exe");
					driver = new EdgeDriver();

				}  

			} else {
				if(browserName.toLowerCase().contains("chrome".toLowerCase())) {
					System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
					driver = new ChromeDriver();
				} else if(browserName.toLowerCase().contains("Mozilla fire fox".toLowerCase())) {
					System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
					driver = new FirefoxDriver();

				}  else {
					//add safari							
				} 	

			}
		}
		catch (Exception e) {
			System.out.println("Unable to create driver.Probably browser is crashed");
		}
	}

	public void openWebsite(String URL) {
		try {
			driver.manage().window().maximize();
			driver.get(URL);
		} catch (Exception e) {
			System.out.println("Unable to open website");
		}
	}

	
	public void clickOnElement(By locator, String elementName, long waitTime) {
	    try {
	        if (driver1 instanceof IOSDriver) {
	            WebDriverWait wait = new WebDriverWait(driver1, waitTime);
	            MobileElement eleClick = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(locator));
	            eleClick.click();
	        } else {
	            WebDriverWait wait = new WebDriverWait(driver, waitTime);
	            WebElement eleClick = wait.until(ExpectedConditions.elementToBeClickable(locator));
	            eleClick.click();
	        }
	        System.out.println("Successfully clicked on : " + elementName);
	    } catch (Exception e) {
	        System.out.println("Unable to click on: " + elementName);
	        e.printStackTrace();
	    }
	}



	//	protected boolean clickOnElement(By locator, String elementName, long waitTime) {
	//	    boolean isClicked = false;
	//	    try {
	//	        WebDriverWait wait = new WebDriverWait(driver, waitTime);
	//	        WebElement eleClick = wait.until(ExpectedConditions.elementToBeClickable(locator));
	//
	//	        // Highlight the element
	//	        JavascriptExecutor js = (JavascriptExecutor) driver;
	//	        js.executeScript("arguments[0].style.border='2px solid red'", eleClick);
	//	        Thread.sleep(500); // Wait for a short moment to see the highlight
	//
	//	        eleClick.click();
	//	        isClicked = true;
	//	        System.out.println("Successfully clicked on : " + elementName);
	//
	//	        // Remove highlight after clicking
	//	        js.executeScript("arguments[0].style.border=''", eleClick);
	//	    } catch (TimeoutException e) {
	//	        System.out.println("Element " + elementName + " not clickable within " + waitTime + " seconds.");
	//	    } catch (Exception e) {
	//	        System.out.println("Unable to click on: " + elementName);
	//	    }
	//	    return isClicked;
	//	}



	//	protected boolean clickOnElement(By locator, String elementName, long waitTime) {
	//	    boolean isClicked = false;
	//	    try {
	//	        WebElement eleClick = driver.findElement(locator);
	//
	//	        // Highlight the element
	//	        JavascriptExecutor js = (JavascriptExecutor) driver;
	//	        js.executeScript("arguments[0].style.border='2px solid red'", eleClick);
	//	        Thread.sleep(500); // Wait for a short moment to see the highlight
	//
	//	        eleClick.click();
	//	        isClicked = true;
	//	        System.out.println("Successfully clicked on : " + elementName);
	//
	//	        // Remove highlight after clicking
	//	        js.executeScript("arguments[0].style.border=''", eleClick);
	//	    } catch (NoSuchElementException e) {
	//	        System.out.println("Element " + elementName + " not found. Proceeding to the next step.");
	//	    } catch (Exception e) {
	//	        System.out.println("Unable to click on: " + elementName);
	//	    }
	//	    return isClicked;
	//	}

	//	protected boolean clickOnElement(By locator, String elementName, long waitTime) {
	//	    boolean isClicked = false;
	//	    try {
	//	        WebDriverWait wait = new WebDriverWait(driver, waitTime);
	//	        WebElement eleClick = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	//	        
	//	        // Highlight the element
	//	        JavascriptExecutor js = (JavascriptExecutor) driver;
	//	        js.executeScript("arguments[0].style.border='2px solid red'", eleClick);
	//	        Thread.sleep(500); // Wait for a short moment to see the highlight
	//	        
	//	        eleClick.click();
	//	        isClicked = true;
	//	        System.out.println("Successfully clicked on : " + elementName);
	//	        
	//	        // Remove highlight after clicking
	//	        js.executeScript("arguments[0].style.border=''", eleClick);
	//	    } catch (Exception e) {
	//	        System.out.println("Unable to click on: " + elementName);
	//	    }
	//	    return isClicked;
	//	}

	protected boolean clickOnElement1(By locator, String elementName, long waitTime) {
		boolean isClicked = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement eleClick = wait.until(ExpectedConditions.elementToBeClickable(locator));
			eleClick.click();
			isClicked = true;
			System.out.println("Successfully clicked on : " +elementName);
		} catch (Exception e) {
			System.out.println("Unable to click on: " +elementName);
		}
		return isClicked;
	}





	protected String toastmessage(By locator, String elementName, long waitTime) {
		String eleEnterText = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement eleClick = wait.until(ExpectedConditions.elementToBeClickable(locator));
			eleClick.getText();

			System.out.println("Toast Message is verified : "+eleClick.getText());

			Assert.assertEquals(eleClick.getText(),elementName);


		} catch (Exception e) {
			System.out.println("Unable to see toast message" +elementName);
		}
		return eleEnterText;
	}

	protected boolean verifyPage(By locator, String elementName, long waitTime) {
		boolean isVerified = false;
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			isVerified = true;
			System.out.println("Successfully verify the page");

		} catch (Exception e) {
			System.out.println("Unable to verify page");
		}
		return isVerified;

	}

	
	protected WebElement enterTextInTextbox(By locator, String elementName, String text, long waitTime) {
		WebElement eleEnterText = null;
		try {

			WebDriverWait wait = new WebDriverWait(driver,10);

			eleEnterText = wait.until(ExpectedConditions.elementToBeClickable(locator));
			eleEnterText.click();
			eleEnterText.clear();
			eleEnterText.sendKeys(text);
			System.out.println("Successfully Enter Text in : " +elementName);
		} catch (Exception e) {
			System.out.println("Unable to enter text in : " +elementName);
		}
		return eleEnterText;
	}

	
	

	public void closeBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Unable to close browser");
		}
	}
	
	protected WebElement enterTextInTextboxMobile(By locator, String elementName, String text, long waitTime) {

	    WebElement eleEnterText = null;

	    try {
	        WebDriverWait wait = new WebDriverWait(driver1, waitTime);
	        eleEnterText = wait.until(ExpectedConditions.elementToBeClickable(locator));

	        eleEnterText.click();
	        eleEnterText.clear();

	        for (char c : text.toCharArray()) {
	            eleEnterText.sendKeys(String.valueOf(c));
	            try {
	                Thread.sleep(1); // Add 1 millisecond delay between each character
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	        // Hide the keyboard using Appium if it's an Appium driver instance
	        if (driver1 instanceof AppiumDriver) {
	            AppiumDriver<MobileElement> appiumDriver = (AppiumDriver<MobileElement>) driver1;
	            appiumDriver.hideKeyboard();
	        }

	        System.out.println("Successfully Entered Text in : " + elementName);
	    } catch (Exception e) {
	        System.out.println("Unable to enter text in : " + elementName);
	        e.printStackTrace(); // Print the stack trace for better debugging
	    }
	    return eleEnterText;
	}
	
	
	
	protected void moveSlider(By sliderLocator, int xOffset, int yOffset) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(sliderLocator));
			Actions actions = new Actions(driver);
			actions.dragAndDropBy(slider, xOffset, yOffset).perform();
			System.out.println("Slider moved successfully");
		} catch (Exception e) {
			System.out.println("Unable to move slider");
		}
	}


	protected String getText(By elementLocator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 1000); // Adjust the timeout as needed

			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
			String text = element.getText();
			System.out.println("Text fetched successfully from element: " + text); // Print success message
			return text;
		} catch (Exception e) {
			System.out.println("Unable to get text from element: " + e.getMessage()); // Print error message along with exception details
			return null;
		}
	}



	



}

