package runner;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.BooksAndSubscriptionPageObject;
import pages.CancerPageObjects;
import pages.HomePageObject;
import pages.RealatedDieasesObjects;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
public class Test_runner {
	
	Base call=new Base();
	WebDriver driver;
	HomePageObject home=new HomePageObject();
	BooksAndSubscriptionPageObject books=new BooksAndSubscriptionPageObject(); 
	CancerPageObjects cancer=new CancerPageObjects();
	RealatedDieasesObjects objects =new RealatedDieasesObjects();
	ExtentReports extent;
	ExtentTest test;
	Logger log=LoggerHandler.createLog("Log Reports");
	@BeforeTest
	public void report()
	{
	extent=Reporter.getExtentReport();
	}
@BeforeMethod
public void openBrowser()
{
	driver=call.openBrowser();
	call.openUrl(driver);
	}
@Test
public void function() 
{
	test=extent.createTest("Test-1");
	home.clickOnHealthlib(driver, test,log);
	home.clickOnBooksandSubscription(driver,test);
	books.clickOnFrame(driver,test);
	books.clickOnBooks(driver,test);
	cancer.sendData(driver,test);
	cancer.AddToCart(driver,test);
	
}
@Test
public void function2()
{
	test=extent.createTest("Test 2");
	home.clickOnButton(driver,test);
	objects.VerifyText(driver,test);
	

}

@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}
@AfterTest
public void flush()
{
	extent.flush();
}
}

