package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VelocityPage {

	
public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/AUTOMATION/WebPage/MAY21_Evening.html");
		
		WebElement un = driver.findElement(By.className("Textbox1"));
		un.sendKeys("pariharparag@gmail.com");
		System.out.println("Username entered successfully");
		
//		driver.findElement(By.partialLinkText("O TO FLI")).click();
//		System.out.println("Navigate to link successfully");
//		
//		driver.findElement(By.tagName("button")).click();
//		System.out.println("Login button clicked successfully");
		
		driver.findElement(By.xpath("//a[contains(text(), 'O TO FLIP')]")).click();
		
		driver.navigate().back();
	
		
		driver.findElement(By.xpath("(//input)[6]")).click();
		System.out.println("Radio button clicked female successfully");
		
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//textarea[contains(@jsname, 'ZiJb')]")).sendKeys("Katrina Kaif");
		
		
		
		Thread.sleep(5000);
		driver.close();
	}
}

