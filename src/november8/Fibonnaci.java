package november8;

public class Fibonnaci {

	public static void main(String[] args) {
		
		/*
		 * int a=0; int b=1; int c;
		 * 
		 * for(int i=1; i<=10; i++) {
		 * 
		 * c = a+b;
		 * 
		 * System.out.println(c);
		 * 
		 * a=b; b=c;
		 * 
		 * }
		 */
		
		
		
		int c = 89;
		int b = 55;
		int a ;
		
		System.out.println(c);
		System.out.println(b);
		for (int i=1; i<=8; i++) {
			
			a = c-b;
			
			System.out.println(a);
			
			c=b;
			b=a;
		}

	}

}
