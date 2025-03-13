package november8;

import java.util.Arrays;

public class FirstAndSecondGreaterNumberFromArrayWithoutUsingSorting {

	public static void main(String[] args) {

		/*
		 * int[] a = {1,2,3,4,5,6,7,8,9};
		 * 
		 * 
		 * int temp =0;
		 * 
		 * for(int i=0; i<=a.length-1; i++) {
		 * 
		 * for (int j=i+1; j<=a.length-1; j++) {
		 * 
		 * if (a[i]>a[j]) {
		 * 
		 * temp =a[i];
		 * 
		 * a[i] = a[j];
		 * 
		 * a[j] = temp;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * for (int i=a.length-1; i<=a.length-1; i++) {
		 * 
		 * System.out.println("The first greatest number :"+a[i]); }
		 * 
		 * for (int i=a.length-2; i<=a.length-2; i++) {
		 * 
		 * System.out.println("The Second greatest number :"+a[i]); }
		 */

		
		
		/*
		 * // ANOTHER WAY
		 * 
		 * int[] a = {1,23,4,5,56,7,8,9};
		 * 
		 * int g1=0; int g2=0;
		 * 
		 * for (int i=0; i<=a.length-1; i++) {
		 * 
		 * if (a[i]>g1) {
		 * 
		 * g2 = g1;
		 * 
		 * g1 = a[i]; }
		 * 
		 * }
		 * 
		 * System.out.println("The first greater number is : "+ g1);
		 * System.out.println("The second greater number is : "+ g2);
		 */
		
		
		int[] a = {1,23,4,5,56,7,8,9};
		
		Arrays.sort(a);
		
		 System.out.println("The first greater number is : "+ a[a.length-1] );
		 System.out.println("The Second greater number is : "+ a[a.length-2] );
		 
	}

}
