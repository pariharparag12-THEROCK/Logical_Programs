package june4;

public class CountNumberofdigit {

	public static void main(String[] args) {
		
		int n = 703832;

		int temp =n;
		
		int count=0;
		
		int t;
		
		
		
		
		while(n>0) {
			
			n = n/10;
			
			count =count+1;
		}
		
		
		System.out.println("Number of digits present in  "+temp+" is "+ count);
	}

}
