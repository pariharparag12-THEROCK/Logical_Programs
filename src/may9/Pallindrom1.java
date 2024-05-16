package may9;

import java.awt.geom.Area;
import java.util.Scanner;

import org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits;

import logical.NaturalNumbers;

public class Pallindrom1 {

	public static void main(String[] args) {
		
		int num =0;
		
		for(int n=11; n<=1000; n++) {
			
			
			
//			Scanner orv = new Scanner(System.in);
//			
//			System.out.println("Enter a Number");
			
//			n = orv.nextInt();
			
			int temp=n;
			
			int s=0;
			
			int t;
			
			
			while(temp>0) {
				
				t = temp%10;
				
				s = s*10+t;
				
				temp= temp/10;
				
				
			}
			
			
			
			
			if (n==s) {
				
				System.out.print(s + " ");
				
					 num  = num +1 ;	
				
				}
			
//			else {
//				
//				System.out.println("Number is not pallindrome "+ s);
//			}
			
			

		}
		
		System.out.println(" ");
		
		System.out.println("Total numbers are : " + num);
		
	}

}
