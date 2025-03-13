package september1;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		
		int n = 703832;
		
		//int temp = n;
		
		int count = 0;
		
		
		while(n>0) {
			
			n = n/10;
			
			count = count +1;
			
			
		}

		System.out.println(count);
		
	}

}
