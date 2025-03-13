package november8;

public class ContinousFactorial {

	public static void main(String[] args) {
		
		for (int n=1 ; n<=6; n++) {
			
			//int n = 5;
			
			int fact = 1;
			
			for (int i=1; i<=n; i++) {
				
				fact = fact*i;
			}

			
			System.out.print(fact+" ");
		}
		
		
	}

}
