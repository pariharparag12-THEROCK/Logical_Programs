package array;

import java.util.Arrays;

public class DuplicatesFind {

	public static void main(String[]args) {
	
		String s[] = {"Amol", "Ankit", "Shubham", "Priyanka",  "Ankit", "Amol", "Shubham"};
		
		System.out.println(s.length);
		
		System.out.println("Duplicate are " + "\n");
		
		for(int i =0; i<=s.length-1; i++) {
			for(int j=i+1; j<=s.length-1; j++) {
				if(s[i].equals(s[j]) && i!=j ) {
					System.out.println(s[j]);
				}
			}
		}
	}
}
