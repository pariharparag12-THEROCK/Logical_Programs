package windowHandles;

public interface CommonProperties {

	String key = "webdriver.chrome.driver";
	String value = "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe";
	String url = "https://nxtgenaiacademy.com/multiplewindows/";
	
	public void chromeLaunch() throws InterruptedException;
}
