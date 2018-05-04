package samplePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

import junit.framework.Assert;

public class sampleClass {

	public static void main(String[] args) {
		String name = "Suresh Dubey";
		System.out.println("Name is " + name);
		Assert.assertEquals(name, "Suresh Dubey");	
		
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		Eyes eyes = new Eyes();
		eyes.setApiKey("ecdYGJS4vskfvb8JgyHYV3hXKWBmC8a1cTTVhkvqMC0110");
		
		try {
			eyes.open(driver, "Applitools_Test", "SampleTest");//, new RectangleSize(900, 900));
			driver.get("https://google.co.in");
			eyes.checkWindow("Home page");
			eyes.close();
		} catch (Exception e) {
			driver.quit();
			eyes.abortIfNotClosed();
		}
	}
}
