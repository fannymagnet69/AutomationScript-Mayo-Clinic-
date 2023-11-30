package pages;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.RealatedDieasesLocators;
import utils.WebDriverHelper;

public class RealatedDieasesObjects {
	
	WebDriver driver;
	WebDriverHelper helper;
	RealatedDieasesLocators locators3=new RealatedDieasesLocators();
	
	public void VerifyText(WebDriver driver, ExtentTest test)
	{
		String textToVerify=driver.findElement(locators3.HairyCellLeukameia).getText();
		String finalText="Hairy cell leukemia";
		if(textToVerify.contains(finalText))
		{
			System.out.println("Text Verified");
			
			
		}
		else
		{
			System.out.println("Not Verified");
			test.log(Status.FAIL, "Clicked on HealthLib");
		}
	}

}
