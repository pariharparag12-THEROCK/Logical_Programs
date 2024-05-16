package may9;


import java.util.LinkedHashSet;


public class ArrayintoCollection {

	
	public static void main(String[]args) {
		
		
		
		int p[] = {4,2,1,3,5,765,8,9,9,0,4,10};
		
		
		LinkedHashSet ts = new LinkedHashSet();
		
		for (int i=0; i<=p.length-1; i++) {
			
	
			ts.add(p[i]);
			
			
		}
		
		System.out.println(ts);
		
	}
	
}

