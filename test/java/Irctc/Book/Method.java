package Irctc.Book;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Method {

	public static WebDriver test = new FirefoxDriver();
	public static Properties p = new Properties();

	public void Javascript() {
		JavascriptExecutor js = (JavascriptExecutor) test;
		js.executeScript("window.alert('Enter Valid Captcha')");
	}

	public void msg() {
		System.out.println("Test Case Passed");
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

	public void Hardwait() throws InterruptedException {
		Thread.sleep(10000);
	}
}
