package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.HomePage;
import pomPackage.LoginPage;

public class TestClass {

	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost/login.do");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.sendUsername();
		loginpage.sendPassword();
		loginpage.clickOnLogin();
		
		HomePage homepage = new HomePage(driver);
		homepage.clickOnReportbutton();
		
	
	}
}
