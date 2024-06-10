package june4;

import java.util.Arrays;

public class SecondLargestNumberUsingSorting {

	public static void main(String[] args) {
		
		int num[] = {10, 100, 56, 89, 34, 78, 87, 67};
		
		
		Arrays.sort(num);
		
		for (int i=0; i<=num.length-1; i++) {
			System.out.print(num[i]+" ");
		}

		System.out.println();
		
		System.out.println(num[num.length-2]);
	}

}
