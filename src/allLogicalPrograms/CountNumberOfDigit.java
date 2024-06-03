package allLogicalPrograms;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		
		int n = 703832;
		
		int temp = n;
		
		int count =0;
		
		int t;
		
		
		while(n>0) {
			
			n = n/10; //70383, 7038, 703, 70, 7, 0
			
			count = count+1; //1, 2, 3, 4, 5, 6
			
		}
		
		
		System.out.println("Number of Count in digit "+ temp+" is : "+count);
	}

}
