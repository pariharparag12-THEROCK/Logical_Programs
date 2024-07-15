package hfjgh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Synechron_program {

	

		
		    public static void main(String[] args) {
		    	
		        String S1[] = {"mumbai", "delhi", "chennai", "indore"};
		        String S2[] = {"mandsaur", "hyderabaad", "banglore", "mumbai", "pune", "delhi"};

		        // Converting arrays to ArrayLists
		        ArrayList<String> list1 = new ArrayList(Arrays.asList(S1));
		        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(S2));
		        
		        System.out.println(list1);
		        System.out.println(list2);
		        
		        // Creating a HashSet for duplicates
		        HashSet<String> duplicates = new HashSet<>();
		        
		        // Creating an ArrayList for non-duplicates
		        ArrayList<String> nonDuplicates = new ArrayList<>();
		        
		        // Checking for duplicates
		        for (String city : list1) {
		            if (list2.contains(city)) {
		                duplicates.add(city);
		            }
		        }

		        // Adding non-duplicates from list1
		        for (String city : list1) {
		            if (!duplicates.contains(city)) {
		                nonDuplicates.add(city);
		            }
		        }

		        // Adding non-duplicates from list2
		        for (String city : list2) {
		            if (!duplicates.contains(city)) {
		                nonDuplicates.add(city);
		            }
		        }

		        // Converting HashSet to ArrayList for duplicates
		        ArrayList<String> duplicatesList = new ArrayList<>(duplicates);

		        // Output the results
		        System.out.println("Duplicates: " + duplicatesList);
		        System.out.println("Non-Duplicates: " + nonDuplicates);
		    }
		


}


