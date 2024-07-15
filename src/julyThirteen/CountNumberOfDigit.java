package julyThirteen;

public class CountNumberOfDigit {

	public static void main(String[] args) {

		int n = 703832;
		
		int temp = n;
		
		int s = 0;
		
		int t ;
		
		while(temp>0) {
			
			temp =temp/10;
			
			s = s+1;
		}
		
		System.out.println(s+ " digits are present in given numbers");

	}

}
