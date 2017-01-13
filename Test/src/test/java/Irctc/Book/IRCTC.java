package Irctc.Book;

import java.io.IOException;
import org.testng.annotations.Test;

public class IRCTC extends Objects {

	@Test
	public void Launch() throws InterruptedException, IOException {

		form.Launch1();
		logMessage("----Launch Application Successfully----");
	}

	@Test(dependsOnMethods = "Launch")
	public void Login() throws Exception {

		form.Login1();
		logMessage("Logged in Successfully");

	}

	@Test(dependsOnMethods = "Login")
	public void FindTrain() throws IOException {

		form.FindTrain1();
		logMessage("Find Train Successfully");
	}

	@Test(dependsOnMethods = "FindTrain")
	public void Availability() throws Exception {

		form.Availability1();
		logMessage("Available");
		Screenshot();

	}

	@Test(dependsOnMethods = "Availability")
	public void Passengers() throws Exception {

		form.Pass();

	}
}
