package Test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Keywords.Basicauth;
import Keywords.Brokenimage;
import Keywords.ExitIntent;

public class NewTest {

	WebDriver driver;
	Brokenimage image;
	@Test
	public void validate_image() throws InterruptedException {

		System.out.println("==============================================================");
		image = new Brokenimage(driver);
		image.validateInvalidImages();

	}


	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://10.0.31.161:9292/");

		driver.manage().window().maximize();

	}

	@AfterMethod
	public void afterMethod() {
		driver.get("http://10.0.31.161:9292/");

	}

	@AfterClass
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
