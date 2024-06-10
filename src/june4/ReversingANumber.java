package june4;

public class ReversingANumber {

	public static void main(String[] args) {
		
		
			int n=	788876;
			
			int temp = n;
			
			int s =  0;
			
			int t;
			
			while(temp>0) {
				
				t = temp%10;
				
				s =s*10 +t;
				
				temp = temp/10;
				
			}
			
			System.out.println(" reversing a number is: "+s);

	}

}
