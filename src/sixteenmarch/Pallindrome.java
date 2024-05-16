package sixteenmarch;

import java.util.Scanner;

public class Pallindrome {

	
	public static void main(String[]args) {
		
		int n ; 
		
		Scanner orv = new Scanner(System.in);
		
	    n =  orv.nextInt();
		
	    int temp = n;
	    
	    int s = 0;
	    
	    int t;
	    
	    while(temp>0) {
	    	
	    	t = temp%10; //3, 4, 3
	    	
	    	s = s*10 +t; // 3, 34, 343
	    	
	    	temp = temp/10; // 34, 3, 0
	    	
	    }
	    
	    
	    if (n==s) {
	    	System.out.println(s + " is Pallindrome number");
	    }
	   
	    else {
	    	System.out.println(s + " is not Pallindrome number");
	    }
	    
	    orv.close();
	}
}
