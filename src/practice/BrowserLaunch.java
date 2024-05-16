package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch implements CommonProperties {

	static WebDriver driver;
	
	public void chromeLaunch() {
		System.setProperty(Key1, value1);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	
	
}
