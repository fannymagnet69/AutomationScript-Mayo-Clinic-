package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.CancerPageLocators;
import utils.Screenshot;
import utils.WebDriverHelper;

public class CancerPageObjects {
	
	WebDriver driver;
	WebDriverHelper helper;
	CancerPageLocators cancerPagelocators=new CancerPageLocators();
	
	public void sendData(WebDriver driver, ExtentTest test)
	{
		helper=new WebDriverHelper(driver);
		try
		{
			helper.jsScroll2(driver, 500);
			test.log(Status.PASS, "Scroll done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			test.log(Status.FAIL, "Scroll done");
		}
		try
		{
			helper.clickOnElement(cancerPagelocators.Quantity);
			driver.findElement(cancerPagelocators.Quantity).clear();
			test.log(Status.PASS, "Quantity Box Clicked");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			test.log(Status.FAIL, "Quantity box not Clicked");
		}
		
		try
		{
			helper.sendKeys(cancerPagelocators.Quantity, "2");
			Thread.sleep(2000);
			test.log(Status.PASS, "Data Sent");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			test.log(Status.PASS, "Data Not Sent");
		}
	}
	public void AddToCart(WebDriver driver, ExtentTest test)
	{
		helper=new WebDriverHelper(driver);
		try
		{
			helper.clickOnElement(cancerPagelocators.AddtoCart);
			Screenshot.getScreenshotAsBase64String(driver, "Screenshot-2");
			Thread.sleep(3000);
			test.log(Status.PASS, "Add To Cart clicked");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			test.log(Status.FAIL, "Add To Cart not clicked");
		}
	}

}
