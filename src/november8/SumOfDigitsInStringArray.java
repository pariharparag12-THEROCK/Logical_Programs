package november8;

public class SumOfDigitsInStringArray {

	public static void main(String[] args) {
		
		String S[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		int a[] = new int[S.length];
		
		int count =0;
		
		int sum =0;
		
		for (int i=0; i<=S.length-1; i++) {
			
			
			a[i] =  Integer.parseInt(S[i]);
			
			if (a[i]>=0 && a[i]<=9) {
				
				sum = sum+a[i];
				count = count+1;
			}
				
			
		}
		
		System.out.println("The sum of String array is : "+ sum);
		System.out.println("The count of String array is : "+ count);

	}

}
