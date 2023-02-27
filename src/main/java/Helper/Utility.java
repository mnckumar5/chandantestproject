// 
// Decompiled by Procyon v0.5.36
// 

package Helper;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;

import java.time.Duration;
import org.testng.Reporter;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static Alert waitforalert(WebDriver driver) {
		Alert alt = null;
		for (int i = 0; i < 15; i++)

		{

			try {
				alt = driver.switchTo().alert();

			} catch (NoAlertPresentException e) {
				// System.out.println("Waiting for Alert");
				waitforseconds(15);

			}

		}
		return alt;
	}

	public static void waitforseconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {

		}
	}

	public static Alert waitforalert(WebDriver driver, int time)

	{
		Alert alt = null;
		for (int i = 0; i < time; i++) {
			try {
				alt = driver.switchTo().alert();
			} catch (NoAlertPresentException e) {
				// System.out.println("Waiting for Alert");
				waitforseconds(1);
			}
		}

		return alt;

	}

	public static void captureScreenshot(WebDriver driver) {
		try {
			FileHandler.copy(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
					new File("./screenshots/Screenshot_" + getCurrentTime() + ".png"));
		} catch (IOException e) {
			System.out.println("Something went wrong " + e.getMessage());
		}
	}

	public static String getCurrentTime()

	{
		String date = new SimpleDateFormat("HHmmss_dd_MM_yyyy").format(new Date());

		return date;
	}

	public static String captureScreenshotInBase64(WebDriver driver) {

		TakesScreenshot ts = (TakesScreenshot) driver;

		String base64 = ts.getScreenshotAs(OutputType.BASE64);

		return base64;

	}

}
