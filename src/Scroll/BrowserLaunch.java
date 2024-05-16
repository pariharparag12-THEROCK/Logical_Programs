package Scroll;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("scroll(0,2200)");
		Thread.sleep(3000);
		j.executeScript("scroll(0,-2000)");
		Thread.sleep(3000);
		j.executeScript("scroll(0,1800)");
		Thread.sleep(3000);
		
		String p = driver.getWindowHandle();
		System.out.println(p);
		
		WebElement iframeElement = driver.findElement(By.xpath(" //iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframeElement);
		
		WebElement jmeter = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jmeter.click();
		
		Thread.sleep(3000);
		
		Set<String> pc = driver.getWindowHandles();
		System.out.println(pc);
		Thread.sleep(3000);
		
		for (String c : pc) {
			if(!p.equalsIgnoreCase(c)) {
				driver.switchTo().window(c);
				System.out.println(c);
				driver.close();
			}
			
			
		}
		
//		driver.switchTo().window(p);
//		
//		Thread.sleep(3000);
//
//		
//		driver.switchTo().defaultContent();
//		
//		driver.navigate().refresh();
//		
//		j.executeScript("scroll(0,-1800)");
//		
//		
//		Thread.sleep(3000);
	
		
		
	}

}
