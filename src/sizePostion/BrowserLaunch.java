package sizePostion;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch implements CommonProperties {

	
	static WebDriver driver;
	
	public void chromeLaunch() throws InterruptedException {
		
		System.setProperty(key, value);
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		
//		Dimension d = new Dimension (1000,500);
//		driver.manage().window().setSize(d);
		
		Point p = new Point(400,-100);
		driver.manage().window().setPosition(p);
	}

}
