package testClasses;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testClassPractice {

	@BeforeClass
	public void beforeClass() {
			System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Before Method");
	}
	
	@Test (priority = 1)
	public void testA() {
		System.out.println("Test A");
	}
	
	@Test (priority = 2)
	public void testB() {
			System.out.println("Test B");
			
	}
	
	@Test ( priority = 0, dependsOnMethods= {"testA","testB"})//AND operator will be used - if both the condition true then it will proceed
	public void testC() {
			System.out.println("Test C");
		
	}
	
	@Test (enabled=false)
	public void testD() {
			System.out.println("Test D");
	}
	
	@Test (timeOut =50000)
	public void teste() {
			System.out.println("Test E");
	}
	
	
	@AfterMethod
	public void afterMethod(){
		
		System.out.println("After Method");

	}
	
	@AfterClass
	public void afterClass() {
	System.out.println("After Class");
	}
}


