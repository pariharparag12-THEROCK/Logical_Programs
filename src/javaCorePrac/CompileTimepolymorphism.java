package javaCorePrac;

public class CompileTimepolymorphism {

	public void AreaOfSquare(int a , int b) {
		
		int c = a*b;
		
		System.out.println("Area of square1 is : "+c);
	}
	
	public void AreaOfSquare(int a ) {
		
		int c = a*a;
		
		System.out.println("Area of square2 is : "+c);
	}
	
	
	public static void main(String []args) {
		
		CompileTimepolymorphism orv = new CompileTimepolymorphism();
		
		orv.AreaOfSquare(10,20);
		
		orv.AreaOfSquare(10);
	}
}
