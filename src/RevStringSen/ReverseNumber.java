package RevStringSen;



public class ReverseNumber {

	public static void main(String []args) {
		
		int n = 5211;
		
		int s = 0;
		
		int t;
		
		
		while(n>0) {
			
			t = n%10;
			
			s = s*10+t;
			
			n =n/10;
		}
		
		System.out.println(s);
		
		
		
		
	}
}
