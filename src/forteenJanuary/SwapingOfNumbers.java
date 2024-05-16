package forteenJanuary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SwapingOfNumbers {

	public static void main(String[] args) {
		
      int a = 100; 
      int b = 300;
      
      a = a+b; //400
      
      b = a-b; // 100
      
      a = a-b;//300
      
      System.out.println("a = "+a);
      System.out.println("b = "+b);
	}
}
