package coreJavaPractice;

public class AreaOfCircle {

	public void area(int a, int b) {
		
		 int c = a*b;
		 
		 System.out.println("Area 1 is "+c);
	}
	
	
	public void area(int a) {
		
		int c =a*a;
		
		System.out.println("Area 2 is "+c);

	}
	
	public static void main(String[]args) {
		AreaOfCircle orv =new AreaOfCircle();
		
		orv.area(10, 20);
		orv.area(5);
	}
	
	
}
