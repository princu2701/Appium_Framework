package frametest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Frame.capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class maintest extends capabilities {

	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void bt() throws IOException, InterruptedException {

		service = startServer();

		driver = cap(appactivity, apppackage, deviceName);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test

	public void test1() {

		System.out.println("Api Done");

		service.stop();

	}

}
