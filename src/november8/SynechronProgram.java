package november8;

import java.util.ArrayList;
import java.util.Arrays;

public class SynechronProgram {

	public static void main(String[] args) {
		
		String S1[] = {"mumbai", "delhi", "chennai", "indore"};
		 
	    String S2[] = {"mandsaur", "hyderabaad", "banglore", "mumbai", "pune", "delhi"};

	    ArrayList<String> list1 = new ArrayList<>(Arrays.asList(S1));
	    ArrayList<String> list2 = new ArrayList<>(Arrays.asList(S2));
	    
	    System.out.println(list1);	    
	    System.out.println(list2);
	    
	    ArrayList<String> duplicates = new ArrayList<>();
	    ArrayList<String> nonduplicates = new ArrayList<>();
	    
	    //Duplicates
	    for (String city : list1) {
	    	
	    	if (list2.contains(city)){
	    		duplicates.add(city);
	    	}
	    	
	    }
	    
	    System.out.println("Duplicates are :"+duplicates);
	    
	    //Nonduplicates from list1
	    for (String city : list1) {
	    	if (!duplicates.contains(city)) {
	    		nonduplicates.add(city);
	    	}
	    }
	    
	  //Nonduplicates from list2
	    for (String city : list2) {
	    	if (!duplicates.contains(city)) {
	    		nonduplicates.add(city);
	    	}
	    } 
	    
	    System.out.println("Non-Duplicates are :"+nonduplicates);
	    
	    
	    
	    
	}

}
