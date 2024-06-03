package allLogicalPrograms;

public class DuplicatefindfromINTArray1 {

	
	public static void main(String[]array) {
		
		int s[] = {1,2,3,4,9,6,7,7,1,2,3,4,9};
		
		
		
		for (int i=0; i<=s.length-1; i++) {
			
			for (int j=i+1; j<=s.length-1; j++) {
				
				if (s[i]==s[j] && i!=j) {
					
					System.out.print(s[j]+ " ");
				}
			}
		}
	}
}
