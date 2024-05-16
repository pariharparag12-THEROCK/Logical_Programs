package sixteenmarch;

public class Fibonaaci {

	public static void main(String args[]) {
		
		int c = 89;
		int b = 55;
		int a;
		
		for(int i=1; i<=8; i++) {
			
			a = c-b;
			
			System.out.println(a);
			
			c = b;
			b = a;
			
		}
		
		
	}
}
