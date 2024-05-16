package sixteenmarch;

public class ContinousFactorial {

	public static void main(String[] args) {

		int n = 5; //120j

		
		for(int j=1; j<=n; j++) {
				
			int fact = 1;
			
			for (int i=1; i<=j; i++) {
				
				fact = fact*i;
			}
			
			System.out.print(fact + " ");
		}
		
		
		
		
		
	}

}
