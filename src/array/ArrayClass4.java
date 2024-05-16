package array;

import java.util.Arrays;

public class ArrayClass4 {

	public static void main(String[]args) {
	
		
		int f[] = new int[5];
		
		 f[0] = 40;
		 f[1] = 30;
		 f[2] = 10;
		 f[3] = 50;
		 f[4] = 20;
		 
		 System.out.println();
		 
		 System.out.println("Print in Original form"+ "\n");
		 
		 for(int l : f) {
			 System.out.println(l);
		 }
		 
		 
		 Arrays.sort(f);
		 
		 System.out.println();
		 
		 System.out.println("Print in Ascending form"+ "\n");
		 
		 for(int i=0 ; i<=f.length-1; i++) {
			 System.out.println(f[i]);
		 }
		 
		 System.out.println();
		 
		 System.out.println("Print in Descending form"+ "\n");
		 
		 for(int i=f.length-1; i>=0; i--) {
			 System.out.println(f[i]);
		 }
		 
		 
	}
}
