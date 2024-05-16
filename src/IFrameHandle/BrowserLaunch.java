package IFrameHandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch implements commonProperties{

	
	static WebDriver driver;
	
	public void chromeLaunch() throws InterruptedException {
		
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		WebElement orv = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(orv);
		
		driver.findElement(By.xpath("(//a[text()='Job Support'])[1]")).click();
		
		
		System.out.println("Element clicked successfully");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		Thread.sleep(5000);
		System.out.print("Element typed successfully");
	}

}
