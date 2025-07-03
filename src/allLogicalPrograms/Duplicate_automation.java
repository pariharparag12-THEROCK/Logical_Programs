package allLogicalPrograms;

import java.util.HashMap;

public class Duplicate_automation {

	public static void main(String[] args) {
		
		
		String s1 = "automation";
		
		System.out.println(s1);

        char[] S = s1.toCharArray();
        
//        HashMap<Character, Integer> frequencyMap = new HashMap<>();
//
//        // First, count occurrences of each character
//        for (char c : S) {
//            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
//        }
//
//        // Replace all characters that appear more than once with '2'
//        for (int i = 0; i < S.length; i++) {
//            if (frequencyMap.get(S[i]) > 1) { 
//                S[i] = '2';
//            }
//        }
//
//        // Print the modified string
//        System.out.println(new String(S).trim());
        
        
        HashMap<Character, Integer> hashmap = new HashMap<>();
        
        for(char f : S) {
        	
        	if (hashmap.containsKey(f)) {
        		
        		hashmap.put(f, hashmap.get(f)+1);
        	}
        	
        	else {
        		
        		hashmap.put(f, 1);
        	}
        	
        }
        
        System.out.println(hashmap);
        
        
        
        for(int i=0; i<=S.length-1; i++) {
        	
        	if (hashmap.get(S[i])>1){
        		
        		S[i]='2';    		
        		
        		//System.out.print(S[i]);
        	}
        	
        	
//        	else {
//        		System.out.print(S[i]);
//        	}
        	
        	
        }
        
        System.out.println();
        
 
//        for(int i=0; i<=S.length-1; i++) {
//        	
//        	System.out.print(S[i]);
//        }
       
        
        
        
        String S2 = new String(S);
        
        System.out.print(S2);
        
        
	}
	
   
}
