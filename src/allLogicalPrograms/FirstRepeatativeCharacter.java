package allLogicalPrograms;

public class FirstRepeatativeCharacter {

	public static void main(String[] args) {
		
		
		/*String s = "hhello";
		
		char ch[] = s.toCharArray();
		
		int count =0;
		
		System.out.println("First repetative character in this String :");
		
		for(int i=0; i<=ch.length-1; i++) {
			
			for(int j=i+1; j<=ch.length-1; j++) {
				
				
				if (ch[i]==ch[j]  && count==0) {
					
					System.out.print(ch[j]+" ");
					
					count =count+1;
				}
				
			}
		}
		
		System.out.println();
		
		if (count==0) {
			System.out.println("No repetative character in this String");
		}
		
		
		*/
		
		
		String s = "hhello";
		
		char ch[] = s.toCharArray();
		
		
		System.out.println("First repetative character in this String :");
		
		for(int i=0; i<=ch.length-1; i++) {
			
			for(int j=i+1; j<=ch.length-1; j++) {
				
				
				if (ch[i]==ch[j]) {
					
					System.out.print(ch[j]+" ");
					
					return;// After finding the first duplicate Exits the entire main() method or stop immediately
					
					//break;
				}
				
			}
		}
		
		
		
		
	}

}
