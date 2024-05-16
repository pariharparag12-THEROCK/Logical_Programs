package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	
	static WebDriver driver;

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		boolean res = 	logo.isDisplayed();
		
		if (res==true) {
			System.out.println("Logo is displayed, Test scenario is Passed");
		}
		
		else {
			System.out.println("Logo is not displayed, Test scenario is Failed");
		}
		
		driver.quit();
		
	}
}
