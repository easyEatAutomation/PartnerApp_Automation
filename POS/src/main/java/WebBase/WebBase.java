package WebBase;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebBase {
	
	protected static WebDriver driver;
	
	public void createDriver(String browserName) {
		try {
			String osName = System.getProperty("os.name");
			
			if(osName.toLowerCase().contains("windows".toLowerCase())) {
				if(browserName.toLowerCase().contains("chrome".toLowerCase())) {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			        
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
	
public void clickOnElement(By locator, String elementName, long wait) {
		
		try {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement eleClick = driver.findElement(locator);
			eleClick.click();
			
			System.out.println("Successfully clicked on : " +elementName);
		} catch (Exception e) {
			System.out.println("Unable to click on: " +elementName);
		}
		}
	
//public static void clickOnElement(WebDriver driver, List<WebElement> elements, int count, String elementName) {
//    try {
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        // Click on the specified number of items or up to the available number of items
//        for (int i = 0; i < Math.min(count, elements.size()); i++) {
//            WebElement element = elements.get(i);
//            element.click();
//            System.out.println("Successfully clicked on " + elementName + " " + (i + 1));
//        }
//    } catch (Exception e) {
//        System.out.println("Unable to click on " + elementName);
//    }
//}
	
//	protected void clickOnElement(By locator, String elementName, long wait) {
//        try {
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            WebElement eleClick = driver.findElement(locator);
//            clickWithJavaScript(eleClick); // Click using JavaScript
//            System.out.println("Successfully clicked on : " + elementName);
//        } catch (Exception e) {
//            System.out.println("Unable to click on: " + elementName);
//        }
//    }
//
//    private void clickWithJavaScript(WebElement element) {
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, 10);
//            wait.until(ExpectedConditions.elementToBeClickable(element));
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click();", element);
//        } catch (Exception e) {
//            System.out.println("Unable to click element with JavaScript: " + e.getMessage());
//        }
//    }

	
	protected String toastmessage(By locator, String elementName, long waitTime) {
		String eleEnterText = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver,1000);
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
			WebDriverWait wait = new WebDriverWait(driver,1000);
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
			
			WebDriverWait wait = new WebDriverWait(driver,1000);
			
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
	
	protected void moveSlider(By sliderLocator, int xOffset, int yOffset) {
        try {
        	WebDriverWait wait = new WebDriverWait(driver,1000);
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
	
