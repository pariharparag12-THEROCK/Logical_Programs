package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {
	
	static WebDriver driver;

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://paytm.com/recharge");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String actTitle = driver.getTitle();
		
		System.out.println(actTitle);
		
		if (actTitle.equalsIgnoreCase("Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans")) {
			System.out.println("Test Scenario is Passed");
		}
		
		else {
			System.out.println("Test Scenario is Failed");
		}
		
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='DTH']")));
		
		link.click();

		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
