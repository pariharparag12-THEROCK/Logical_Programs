package julyThirteen;

public class SumOfDigitsInStringArray {

	public static void main(String[] args) {
		
		String S[] = {"1","2","3", "4", "5", "6", "7", "8", "9"};
		
		SumOfDigitsInStringArray orv = new SumOfDigitsInStringArray();
		
		orv.Method1(S);
		
	
	}
	
	public int Method1(String S[]) {
		
		int a[] = new int[S.length];
				
				int sum =0;
				
				
				for (int i=0; i<=a.length-1; i++) {
					
					a[i] =	Integer.parseInt(S[i]);
					
					if (a[i]>=0 && a[i]<=9) {
						
						sum = sum+a[i];
						
					}
					
				}
				
				
				System.out.println(sum);
				
				System.out.println(a.length);
				return sum;
				
				
			}
			
			
			

}
