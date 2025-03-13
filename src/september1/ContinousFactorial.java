package september1;

public class ContinousFactorial {

	public static void main(String[] args) {
		
		for (int n=1; n<=7; n++) {
		
		int fact =1;
		
			for (int i=1; i<=n; i++) {
				
				fact = fact*i;
				
			}
		
			System.out.print(fact +" ");
		
		}	
		
		

	}

}
