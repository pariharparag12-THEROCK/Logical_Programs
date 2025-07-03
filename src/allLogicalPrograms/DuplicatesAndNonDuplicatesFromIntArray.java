package allLogicalPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatesAndNonDuplicatesFromIntArray {

	public static void main(String[]args) {
		
		int a[] = {1,2,3,4,5};
		
		int b[] = {6,7,2,9,1,3,4,0,3};
		
		
		Integer integerarray1[] = new Integer[a.length];
		
		for(int i=0; i<=a.length-1; i++) {
			
			integerarray1[i] = a[i];
		}
		
		
		
//		for(int i=0; i<=integerarray1.length-1; i++) {
//			
//			 System.out.print(integerarray1[i]);
//		}
//		
//		System.out.println();
		
		Integer integerarray2[] = new Integer[b.length];
		
		for(int i=0; i<=b.length-1; i++) {
			
			integerarray2[i] = b[i];
		}
		
		
        
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(integerarray1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(integerarray2));
        
        System.out.println(list1);
        System.out.println(list2);
        
        ArrayList<Integer> duplicates = new ArrayList<>();
        ArrayList<Integer> nonduplicates = new ArrayList<>();
        
        for (Integer number : list1){
            
            if (list2.contains(number)){
                
                duplicates.add(number);
            }
        }
        
        System.out.println("dupicates are: ");
         System.out.println(duplicates);
        
        
        for (Integer number : list1){
            
            if (!duplicates.contains(number)){
                
                nonduplicates.add(number);
            }
        }
        
        for (Integer number : list2){
            
            if (!duplicates.contains(number)){
                
                nonduplicates.add(number);
            }
        }
        
        System.out.println("non-dupicates are: ");
         System.out.println(nonduplicates);
	}
}
