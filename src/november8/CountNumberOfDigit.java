package november8;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		
		int n = 703832;
		
		int temp =n;
		
		int s=0;
		
		while(temp>0) {
			 temp =temp/10;
			 
			 s=s+1;
		}

		System.out.println("The count of given digit "+ n+" is "+s);
		
		System.out.println();
	}

}
