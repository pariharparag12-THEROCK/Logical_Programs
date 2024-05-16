package logical;

public class ReverseNumber {

	
	public static void main(String[]args) {
		
		int n = 8574;
		int s = 0;
		int t;
		
		while(n>0) {
			
			t = n%10; //4, 7,5, 8
			s = s*10 +t;//4, 47, 475, 4758
			n = n/10;// 857, 85, 8, 0
		}
		
		
		System.out.println(s);
	}
}
