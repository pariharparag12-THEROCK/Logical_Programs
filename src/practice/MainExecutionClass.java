package practice;

public class MainExecutionClass extends BrowserLaunch {

	public static void main(String[]args) throws InterruptedException {
		
		BrowserLaunch orv = new BrowserLaunch();
		
		orv.chromeLaunch();
		
		driver.get(Url1);
		Thread.sleep(3000);
		String tittle = driver.getTitle();
		System.out.println(tittle);
		
		driver.navigate().to(Url2);
		Thread.sleep(3000);
	String currentUrl =	driver.getCurrentUrl();
		
	if(Url2.equals(currentUrl)) {
		System.out.println("Test Scenario is Passed");
	}
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
	}
}
