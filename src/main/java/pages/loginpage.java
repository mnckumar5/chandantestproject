package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage

{
	WebDriver driver;

	public loginpage(WebDriver driver) {
		this.driver = driver;
	}

	By un = By.xpath("//input[@id='email1']");

	By pwd = By.xpath("//input[@id='password1']");

	By login = By.xpath("//button[@type='submit']");

	public void logintoapplication(String usern, String passwd) {
		driver.findElement(un).sendKeys(usern);
		driver.findElement(pwd).sendKeys(passwd);
		driver.findElement(login).click();
	}

}
