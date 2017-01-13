package Irctc.Book;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class Method {

	public static WebDriver test = new FirefoxDriver();
	public static Properties p = new Properties();

	public static void Javascript() {
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) test;
		 * js.executeScript("document.getElementById('12451-SL-GN-0').click();")
		 * ;
		 */

	}

	protected void logMessage(String message) {
		Reporter.log(message, true);
	}

	public void Data() throws IOException {

		FileInputStream fin = new FileInputStream(
				"C:\\Users\\durgeshsharma\\workspace\\Test\\src\\test\\java\\Irctc\\Book\\data.properties");
		p.load(fin);
	}

	public void Screenshot() throws IOException {
		File scrFile = ((TakesScreenshot) test).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\durgeshsharma\\Train\\screenshot.png"));
	}

	public void Time() {
		test.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void Handelalert() {
		Alert alert=test.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

	public void Hardwait() throws InterruptedException {
		Thread.sleep(10000);
	}
}
