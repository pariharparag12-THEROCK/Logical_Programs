package november8;

public class ReversingANumber {

	public static void main(String[] args) {
		
		int n =788876;
		
		int s=0; 
		
		int t;
		
		while(n>0) {
			
			t=n%10;
			
			s=s*10+t;
			
			n=n/10;
		}
		
		System.out.println("The reverse number is : "+s);

	}

}
