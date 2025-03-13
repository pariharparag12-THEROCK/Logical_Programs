package november8;

public class CountAndSumOfIntegerArray {

	public static void main(String[] args) {
		int num[] = {1, 2,3,8,6,5,1,3,2};
		
		int sum = 0;
		
		for (int i=0; i<=num.length-1; i++) {
			
			sum = sum+ num[i];
		}

		
		System.out.println("The sum of Integer Array is: "+ sum);
		
		System.out.println("The Count or length of Integer array is : "+num.length);
	}

}
