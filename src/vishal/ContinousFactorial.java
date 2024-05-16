package vishal;

public class ContinousFactorial {

	public static void main(String[]args){
	
		int n = 7;
		
		
		for (int i=1; i<=n;i++) {
			
			int fact =1;
			
			for(int j=1; j<=i; j++) {
				
				fact = fact*j;
			}
			
			System.out.print(fact +" ");
		}
		
		
	}
}
