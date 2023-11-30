package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.BooksAndSubscriptionPageLocators;
import utils.Screenshot;
import utils.WebDriverHelper;

public class BooksAndSubscriptionPageObject {

	WebDriver driver;
	WebDriverHelper helper;
	BooksAndSubscriptionPageLocators locator2=new BooksAndSubscriptionPageLocators();
	
	
	public void clickOnBooks(WebDriver driver, ExtentTest test)
	{
		helper=new WebDriverHelper(driver);
		try {
			helper.waitForElementToBeVisible(locator2.BookName,30);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		try
		{
			helper.jsClick(locator2.BookName);
			test.log(Status.PASS, "BookName Clicked");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			test.log(Status.FAIL, "BookName Not Clicked");
			
		}
		
		
	}
	public void clickOnFrame(WebDriver driver, ExtentTest test)
	{
		helper=new WebDriverHelper(driver);
		try {
			helper.waitForElementToBeVisible(locator2.Frameoption,30);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			helper.clickOnElement(locator2.Frameoption);
			Screenshot.getScreenshotAsMedia(driver, "Screenshot-1");
			test.log(Status.PASS, "Frame Clicked");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(Status.FAIL, "Frame Not Clicked");
			
		}
	}
}
