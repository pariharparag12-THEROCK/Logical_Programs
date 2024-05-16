package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exception_sequence_Program {

	public static void main(String[]args) {
		
		System.out.println("1");
		
		
		
		
			System.out.println("2");
			
			try {
				FileInputStream fis = new FileInputStream ("E:\\AUTOMATION\\FileNotePad\\Info.txt");
				
				System.out.println("3");
				
				
				
				
				System.out.println("A");
				
				
				System.out.println("B");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			
			}
			
			
		
		
	
			System.out.println("4");
			
		
			
			System.out.println("5");
		

		
		System.out.println("6");
	}
}
