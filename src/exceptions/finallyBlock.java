package exceptions;

public class finallyBlock {

	
	public static void main(String[]args) {
		
		try {
			
			int a,b,c,d;
			a=10;
			b=0;
			d=2;
			c=a/b;
			
			System.out.println(c);
			
			
		}
		
		
		
		finally{
			
			System.out.println("I am Finally Block");
			
		}
		
	}
}
