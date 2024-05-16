package forteenJanuary;



public class Fibonnaci {

	public static void main(String []args) {
		
		
		int c = 89;
		int b = 55;
		int a;
		
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
