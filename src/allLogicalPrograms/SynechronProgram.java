package allLogicalPrograms;

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
	     
	     for (String city : list1) {
	    	 if (list2.contains(city)) {
	    		 duplicates.add(city);
	    	 }
	     }
	     
	     System.out.println("Duplictaes are :"+ duplicates);
	     
	     //Non duplicates from list1
	     for (String city : list1) {
	    	 if (!duplicates.contains(city)) {
	    		 nonduplicates.add(city);  // chennai indore
	    	 }
	     }
	     
	     
	     //Non duplicates from list2
	     for (String city : list2) {
	    	 if (!duplicates.contains(city)) {
	    		 nonduplicates.add(city);  // mandsaur hyderabaad banglore pune
	    	 }
	     }
	     
	     System.out.println("Non-Duplictaes are :"+ nonduplicates);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     /* 
	      
	       String s1[] = {"mumbai", "Delhi","Chennai", "Indore"};
      
      String s2[] ={"Mandsaur", "Hyderabaad", "Banglore", "mumbai", "Pune", "Delhi"};
        
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(s1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(s2));
        
        System.out.println(list1);
        System.out.println(list2);
         
        ArrayList<String> duplicates = new ArrayList<>();
        ArrayList<String> nonduplicates = new ArrayList<>();
        
        for (int i=0; i<=list1.size()-1; i++){
            
            if (list2.contains(list1.get(i))){
                duplicates.add(list1.get(i));
            }
        }
        
        System.out.println(duplicates);
        
        for (int i=0; i<=list1.size()-1; i++){
            
            if (!duplicates.contains(list1.get(i))){
                nonduplicates.add(list1.get(i));
            }
        }
        
        for (int i=0; i<=list2.size()-1; i++){
            
            if (!duplicates.contains(list2.get(i))){
                nonduplicates.add(list2.get(i));
            }
        }
         
         System.out.println(nonduplicates); 
	      
	     
	      */
	      
	}

}
