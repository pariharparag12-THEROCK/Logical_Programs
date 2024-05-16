package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	
	static WebDriver driver;

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://paytm.com/recharge");

		
		WebElement PPPP = driver.findElement(By.xpath("//span[text()='Prepaid/Postpaid']"));
		PPPP.click();
		
		System.out.println("Prepaid postaid option is clicked");
		
		Thread.sleep(2000);
	
		
		//WebElement TB0 = driver.findElement(By.xpath("(//label[text()='Postpaid'])"));
		
		//TB0.click();
			
		System.out.println("radio buttion again is clicked");
		
		Thread.sleep(2000);
		
		WebElement TB2 = driver.findElement(By.xpath("(//i[@class='_3DxO'])[2]"));	
		
	
		//WebElement TB = driver.findElement(By.xpath("//input[@id='radio1']"));	
		
		TB2.click();		
		
		boolean res = TB2.isSelected();
		
		System.out.println(res);
		
		if (res==true) {
			System.out.println("Radio box is selected, Test scenario is Passed");
		}
		
		else {
			System.out.println("Radio box is not selected, Test scenario is Failed");
		}
		
		driver.quit();
		
	}
}
