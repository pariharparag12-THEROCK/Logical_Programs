package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPackage.HomePage;
import pomPackage.LoginPage;

public class ActitimeVerify {
	
	private WebDriver driver; // There is no logic to declare the private keyword in testclass but generally we declare the private keyword.
	private HomePage homepage;
	private LoginPage loginpage;
	
	SoftAssert softassert;
	
	
	@BeforeClass
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Browser Launched Successfully");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://localhost/login.do");
		
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		
		softassert = new SoftAssert();
	}
	
	@BeforeMethod
	public void loginActiTime() throws InterruptedException {

		loginpage.sendUsername();
		loginpage.sendPassword();
		loginpage.clickOnLogin();
		
		System.out.println("Application logged-In Successfully");
	}
	
	@Test (priority = 2)
	public void verifyReportButton() throws InterruptedException {
		
		String Url = driver.getCurrentUrl();//actual result
		
		softassert.assertEquals(Url, "http://localhost/user/submit_tt.do1"); // Actual & expected result eql => Test = PASS
		//Assert.assertNotEquals(Url, "http://localhost/user/submit_tt.do"); // Actual & expected result are not eql => Test = PASS
		
		System.out.println("Next Step");
		
		homepage.clickOnReportbutton();
		
		String Url1 = driver.getCurrentUrl();//actual result
		
		boolean result = Url1.equalsIgnoreCase("http://localhost/reports/reports.do");// yahi pr compare kiya
		
		Assert.assertTrue(result); //result True => Test = PASS  ,  result = False => Test = FAILED
		
		//Assert.assertFalse(result); //result False => Test = PASS  ,  result = True => Test = FAILED
		
		
		String expectedTittle = "actiTIME - Saved Reports";
		
		String tittle = driver.getTitle(); //actual tittle
		
		System.out.println(tittle);

		Assert.assertEquals(tittle, expectedTittle);
		
		softassert.assertAll();
		
		
		
	}
	
	@Test (priority = 1 , invocationCount = 1)
	public void verifyTaskButton() throws InterruptedException {
	
		homepage.clickOnTaskbutton();
		
		String Url = driver.getCurrentUrl();
		
		Assert.assertEquals(Url, "http://localhost/tasks/otasklist.do");
		
		//homepage.verifyLogoutButton();
		
		boolean r = homepage.verifyLogoutButton();
		
		softassert.assertTrue(r);
		
	}
	
	@AfterMethod
	public void logoutActiTime() throws InterruptedException {
		
		
		homepage.clickOnLogoutbutton();
		System.out.println("Application Logout Successfully");

	}
	
	@AfterClass
	public void ClosedBrowser() {
	driver.quit();
	System.out.println("Browser is closed successfully");
	}
}
