package julyThirteen;

public class SumOfTwoNumbersEqualToTarget {

	public static void main(String[] args) {
		
		int num [] = {1, 2, 3, 8};
		
		int target = 10;
		
		for (int i=0; i<=num.length-1; i++) {
			
			for (int j=i+1; j<=num.length-1; j++) {
				
				if (num[i]+num[j]==target) {
					
					System.out.println("The numbers are : "+ num[i]+" and "+num[j]+"\n"+"These are places at index :"+ i+" & "+j);
				}
			}
		}

	}

}
