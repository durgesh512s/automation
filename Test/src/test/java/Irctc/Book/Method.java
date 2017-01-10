package Irctc.Book;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Method {

	public static WebDriver test = new FirefoxDriver();
	public static Properties p = new Properties();

	public static void Data() throws IOException {
		FileInputStream fin = new FileInputStream(
				"C:\\Users\\durgeshsharma\\workspace\\Test\\src\\test\\java\\Irctc\\Book\\data.properties");
		p.load(fin);
	}

	public static void Screenshot() throws IOException {
		Method screenshot = new Method();
		File scrFile = ((TakesScreenshot) test).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\durgeshsharma\\Train\\screenshot.png"));
	}
}
