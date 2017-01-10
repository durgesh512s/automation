package Irctc.Book;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class IRCTC {

	static Method object = new Method();

	@Test
	public static void Launch() throws InterruptedException, IOException {
		Method.Data();
		Method.test.get(Method.p.getProperty("baseurl"));
		Method.test.findElement(By.cssSelector("#demon_content>div>input")).click();
		Reporter.log("Launch Passed");

	}

	@Test(dependsOnMethods = "Launch")
	public static void Login() throws InterruptedException, IOException {

		Method.test.findElement(By.cssSelector("#usernameId")).sendKeys(Method.p.getProperty("username"));
		Method.test.findElement(By.cssSelector(".loginPassword")).sendKeys(Method.p.getProperty("password"));
		Thread.sleep(10000);
		Method.test.findElement(By.cssSelector("#loginbutton")).click();
		Reporter.log("Login Passed");

	}

	@Test(dependsOnMethods = "Login")
	public static void FindTrain() {
		Method.test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Method.test.findElement(By.xpath("//input[@id='jpform:fromStation']")).sendKeys("KANPUR CENTRAL - CNB");
		Method.test.findElement(By.xpath("//input[@id='jpform:toStation']")).sendKeys("NEW DELHI - NDLS");
		// driver.findElement(By.xpath("//a[@id='JpSwapFromTo']")).click();
		// //Swap the route.
		Method.test.findElement(By.xpath("//input[@id='jpform:journeyDateInputDate']")).sendKeys("05-03-2017");
		Method.test.findElement(By.xpath("//input[@id='jpform:jpsubmit']")).click();
		Reporter.log("Find Train Passed");
	}

	@Test(dependsOnMethods = "FindTrain")
	public static void Coach() throws Exception {
		Method.test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Method.test.findElement(By.xpath("//a[@id='cllink-12451-SL-3']")).click();
		// Seats Availability
		Method.test.findElement(By.xpath("//td[@style='padding-top:3px'][1]")).click();
		// Take Screenshot
		Method.Screenshot();
		Reporter.log("Coach Passed");

	}
}
