package september1;

import java.util.ArrayList;
import java.util.Arrays;

public class SynechronProgram {

	public static void main(String[] args) {
		
		String S1[] = {"mumbai", "delhi", "chennai", "indore"};
		 
	    String S2[] = {"mandsaur", "hyderabaad", "banglore", "mumbai", "pune", "delhi"};
	    
	    
	    ArrayList<String> arraylist1 = new ArrayList<>(Arrays.asList(S1));
	    ArrayList<String> arraylist2 = new ArrayList<>(Arrays.asList(S2));
	    
	    System.out.println(arraylist1);
	    System.out.println(arraylist2);
	    
	    ArrayList<String> duplicates = new ArrayList<>();
	    ArrayList<String> nonduplicates = new ArrayList<>();
	    
	    System.out.println("Duplicates are : ");
	    
	    for(String city: arraylist1) {
	    	
	    	if(arraylist2.contains(city)) {	    		
	    		duplicates.add(city);
	    	}
	    	
	    }
	    
	    System.out.println(duplicates);
	    
	    System.out.println("Non Duplicates are : ");
		
	    for (String city :arraylist1) {
	    	
	    	if(!duplicates.contains(city)) {
	    		
	    		nonduplicates.add(city);
	    	}
	    }
	    
	    
		for (String city :arraylist2) {
			    	
			   if(!duplicates.contains(city)) {
			    		
			    	nonduplicates.add(city);
			   }
		}
			    
		System.out.println(nonduplicates);
	}	
}
