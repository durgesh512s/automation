package Irctc.Book;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Form extends Method {
	String Actualtext;

	public void Launch1() throws InterruptedException, IOException {
		test.manage().window().maximize();
		Data();
		test.get(Method.p.getProperty("baseurl"));
		test.findElement(By.cssSelector("#demon_content>div>input")).click();
	}

	public void Login1() throws Exception {
		test.findElement(By.cssSelector("#usernameId")).sendKeys(Method.p.getProperty("username"));
		test.findElement(By.cssSelector(".loginPassword")).sendKeys(Method.p.getProperty("password"));
		Hardwait();
		while (true) {
			WebElement e1 = test.findElement(By.xpath("//span[@class='rf-msg rf-msg-err']"));
			if (!e1.isDisplayed()) {
				break;
			}
			else{
				Handelalert();
				
			}

		}

		test.findElement(By.cssSelector("#loginbutton")).click();
	}

	public void FindTrain1() throws IOException {
		Data();
		test.findElement(By.xpath("//input[@id='jpform:fromStation']")).sendKeys(Method.p.getProperty("from"));
		test.findElement(By.xpath("//input[@id='jpform:toStation']")).sendKeys(Method.p.getProperty("to"));
		// driver.findElement(By.xpath("//a[@id='JpSwapFromTo']")).click();
		// //Swap the route.
		test.findElement(By.xpath("//input[@id='jpform:journeyDateInputDate']")).sendKeys("14-04-2017");
		test.findElement(By.xpath("//input[@id='jpform:jpsubmit']")).click();
	}

	public void Availability1() throws Exception {
		Time();
		test.findElement(By.xpath("//a[@id='cllink-12451-SL-3']")).click();
		Actualtext = Method.test.findElement(By.xpath("(.//*[@id='j_idt369_body']/table/tbody/tr[2]/td[2])[2]"))
				.getText();
		System.out.println(Actualtext);
		Assert.assertEquals("AVAILABLE", Actualtext.substring(0, 9));
		test.findElement(By.xpath("(.//a[@id='12451-SL-GN-0'])[2]")).click();
		Screenshot();
	}

	public void Pass() throws Exception {

		test.findElement(By.xpath("//input[starts-with(@id,'addPassengerForm:psdetail:0:p1')]"))
				.sendKeys(Method.p.getProperty("Passenger1"));
		test.findElement(By.xpath("//input[starts-with(@id,'addPassengerForm:psdetail:1:p1')]"))
				.sendKeys(Method.p.getProperty("Passenger2"));
		test.findElement(By.id("addPassengerForm:psdetail:0:psgnAge")).sendKeys(Method.p.getProperty("Age1"));
		test.findElement(By.id("addPassengerForm:psdetail:1:psgnAge")).sendKeys(Method.p.getProperty("Age2"));
		test.findElement(By.xpath(".//select[@id='addPassengerForm:psdetail:0:psgnGender']//option[@value='M']")) // For
																													// Male
				.click();
		test.findElement(By.xpath(".//select[@id='addPassengerForm:psdetail:1:psgnGender']//option[@value='F']")) // For
																													// Female
				.click();
	}
}
