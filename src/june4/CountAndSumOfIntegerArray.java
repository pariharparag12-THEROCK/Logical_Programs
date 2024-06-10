package june4;

public class CountAndSumOfIntegerArray {

	public static void main(String[] args) {
		
		
		int num[] = {1, 2,3,8,6,5,1,3,2};
		
		
		int count =0;
		
		int sum =0;
		
		
		for (int i=0; i<=num.length-1; i++) {
			
			
			sum = sum + num[i];
			
			count = count +1;
		}
		
		System.out.println("Sum is : "+ sum);
 		
		System.out.println("count is : "+ count);
		
		System.out.println("length is : "+  num.length);
	}

}
