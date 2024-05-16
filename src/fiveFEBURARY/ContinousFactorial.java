package fiveFEBURARY;

public class ContinousFactorial {

	
	public static void main(String[]args) {
		
	
		
		
		
		for (int i=1; i<=8; i++) {
			
			int fact = 1;
			
			for(int j=1; j<=i; j++) {
				
				fact = fact*j;
			}
			
			System.out.print(fact  + " ");
		}
		
	}
}
