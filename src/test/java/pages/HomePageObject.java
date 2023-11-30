package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageObject {

	WebDriver driver;
	WebDriverHelper helper;
	HomePageLocators homeLocators=new HomePageLocators();
	
	public void clickOnHealthlib(WebDriver driver, ExtentTest test, Logger log)
	
	{
		helper=new WebDriverHelper(driver);
		try {
			helper.waitForElementToBeVisible(homeLocators.HealthLib, 30);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		try {
			helper.clickOnElement(homeLocators.HealthLib);
			test.log(Status.PASS, "Clicked on HealthLib");
			log.info("HealthLibrarby Drop down Clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(Status.FAIL, "Not Clicked on HealthLib");
		}
	}
public void clickOnBooksandSubscription(WebDriver driver, ExtentTest test)
	
	{
		helper=new WebDriverHelper(driver);
		try {
			helper.waitForElementToBeVisible(homeLocators.BooksandSubscription, 30);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			helper.clickOnElement(homeLocators.BooksandSubscription);
			test.log(Status.PASS, "Books And Subscription Clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			test.log(Status.FAIL, "Books And Subscription Not Clicked");
		}
	}
public void clickOnButton(WebDriver driver, ExtentTest test)

{
	helper=new WebDriverHelper(driver);
	try {
		helper.waitForElementToBeVisible(homeLocators.Button, 30);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		helper.clickOnElement(homeLocators.Button);
		Screenshot.getScreenshotAsMedia(driver, "Screenshot-3");
		test.log(Status.PASS, "Button Clicked");
		
		Thread.sleep(5000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		test.log(Status.FAIL, "Button Not Clicked");
	}
}
}
