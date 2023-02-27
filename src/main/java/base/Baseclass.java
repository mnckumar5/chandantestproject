package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Browserfactory.Browserfactory;
import dataprovider.ConfigReader;

public class Baseclass

{
	public WebDriver driver;

	@BeforeMethod
	public void setupbrowser() {
		// 1--- Does not suite for Cross Browser---
		System.out.println("Log:Info - Setting up browser");
		driver = Browserfactory.startBrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("url"));
		System.out.println("Log:Info - Application is up and running");
	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
		System.out.println("Log:Info - Closing the Browser and application");
		System.out.println("Log:Info - Closing the Browser and application22222");
	}

}
