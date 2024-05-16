package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	
	static WebDriver driver;

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement TB = driver.findElement(By.xpath("//input[@id='email']"));
		
		boolean res = 	TB.isEnabled();
		
		if (res==true) {
			System.out.println("Textbox is enabled, Test scenario is Passed");
		}
		
		else {
			System.out.println("Textbox is not enabled, Test scenario is Failed");
		}
		
		driver.quit();
		
	}
}
