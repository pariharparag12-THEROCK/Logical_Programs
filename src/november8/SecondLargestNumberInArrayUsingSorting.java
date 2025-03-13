package november8;

import java.util.Arrays;

public class SecondLargestNumberInArrayUsingSorting {

	public static void main(String[] args) {
		
		int num[] = {10, 100, 56, 89, 34, 78, 87, 67};

		Arrays.sort(num);

		
		System.out.println(num[num.length-2]);
	}

}
