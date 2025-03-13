package september1;

public class SumOfDigitsInStringArray {

	public static void main(String[] args) {

		String S[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		SumOfDigitsInStringArray orv = new SumOfDigitsInStringArray();
		
		System.out.println(orv.Method1(S));
	
	}
	
	
	
	public  int Method1(String S[]) {
		
		int a[] = new int[S.length];
		
		int sum=0;
		
		for (int i=0; i<=S.length-1; i++) {
			
			a[i] =	Integer.parseInt(S[i]);
			
			if(a[i]>=0 && a[i]<=10) {
				
				sum = sum+a[i];
				
			}
			
		}
		
		
		//System.out.println("Sum of digits of string array is : "+sum);
		
		System.out.println("Length of string array is : "+ S.length);
		
		return sum;
	}

}
