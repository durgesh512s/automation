package Irctc.Book;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IRCTC {

	static Method object = new Method();
	static Method log = new Method();

	@Test
	public static void Launch() throws InterruptedException, IOException {
		object.Data();
		Method.test.get(Method.p.getProperty("baseurl"));
		Method.test.findElement(By.cssSelector("#demon_content>div>input")).click();
		log.msg();
		object.Screenshot();

	}

	@Test(dependsOnMethods = "Launch")
	public static void Login() throws InterruptedException, IOException {

		Method.test.findElement(By.cssSelector("#usernameId")).sendKeys(Method.p.getProperty("username"));
		Method.test.findElement(By.cssSelector(".loginPassword")).sendKeys(Method.p.getProperty("password"));
		object.Hardwait();
		object.Javascript();
		Method.test.findElement(By.cssSelector("#loginbutton")).click();
		log.msg();
		

	}

	@Test(dependsOnMethods = "Login")
	public static void FindTrain() throws IOException {
		object.Data();
		Method.test.findElement(By.xpath("//input[@id='jpform:fromStation']")).sendKeys(Method.p.getProperty("from"));
		Method.test.findElement(By.xpath("//input[@id='jpform:toStation']")).sendKeys(Method.p.getProperty("to"));
		// driver.findElement(By.xpath("//a[@id='JpSwapFromTo']")).click();
		// //Swap the route.
		Method.test.findElement(By.xpath("//input[@id='jpform:journeyDateInputDate']")).sendKeys("05-03-2017");
		Method.test.findElement(By.xpath("//input[@id='jpform:jpsubmit']")).click();
		log.msg();
	}

	@Test(dependsOnMethods = "FindTrain")
	public static void Coach() throws Exception {
		object.Time();
		Method.test.findElement(By.xpath("//a[@id='cllink-12451-SL-3']")).click();
		// Seats Availability
		object.Javascript();
		log.msg();
		object.Screenshot();

	}
}
