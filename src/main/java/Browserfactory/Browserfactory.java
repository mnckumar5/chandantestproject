package Browserfactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browserfactory

{
	static WebDriver driver;

	public static WebDriver getBrowserInstance() {
		return driver;
	}

	public static WebDriver startBrowser(String browserName, String applicationURL)

	{

		if (browserName.contains("Chrome") || browserName.contains("GC") || browserName.contains("Google Chrome")) {
			driver = (WebDriver) new ChromeDriver();
		} else if (browserName.contains("Firefox")) {
			driver = (WebDriver) new FirefoxDriver();
		} else if (browserName.contains("Safari")) {
			driver = (WebDriver) new SafariDriver();
		} else if (browserName.contains("Edge")) {
			driver = (WebDriver) new EdgeDriver();
		} else {

			driver = (WebDriver) new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30L));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20L));
		driver.get(applicationURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
		return driver;
	}

}
