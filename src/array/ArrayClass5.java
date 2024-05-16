package array;

import java.util.Arrays;

public class ArrayClass5 {

	public static void main(String[]args) {
	
		
		String twoWheelars[] = {"StarCity", "KTM", "RoyalEnfield", "Jawa"};
		
		System.out.println(twoWheelars.length);
		
		System.out.println("Print all information " +"\n");
		
		for (String f : twoWheelars) {
			System.out.println(f);
		}
		
		System.out.println();
		
		Arrays.sort(twoWheelars);
		
		System.out.println("Print all information in assending order "+"\n");
		
		for(int i = 0; i<=twoWheelars.length-1; i++) {
			System.out.println(twoWheelars[i]);
		}
		 
		System.out.println();
		
		
		System.out.println("Print all information in Desending order "+"\n");
		
		for(int i =twoWheelars.length-1 ; i>=0; i--) {
			System.out.println(twoWheelars[i]);
		}
	}
}
