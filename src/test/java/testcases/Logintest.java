package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Browserfactory.Browserfactory;
import base.Baseclass;
import dataprovider.CustomDataProvider;
import pages.loginpage;

public class Logintest extends Baseclass

{
	@Test(dataProvider = "Logindetails", dataProviderClass = CustomDataProvider.class)
	public void logintoapplication(String uname, String pwd) {

		loginpage login = new loginpage(driver);
		login.logintoapplication(uname, pwd);

	}
}
