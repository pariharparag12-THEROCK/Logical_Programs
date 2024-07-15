package julyThirteen;

public class NumberOfVowelsRemoveFromString {

	public static void main(String[] args) {
		
		
		String word = "MumbaI";
		
		String s = word.toLowerCase();
	
		char ch[] = s.toCharArray();
		
		int count = 0;
		
		for (int i=0; i<=ch.length-1; i++) {
			
			if (ch[i]== 'a' || ch[i]== 'e' ||ch[i]== 'i' ||ch[i]== 'o' ||ch[i]== 'u' ) {
				
				continue;
			}
			
			else {
				
				System.out.print(ch[i]+ " ");
				
				count = count+1;
			}
		}
		
		System.out.println();
		
		System.out.println(count);
	}

}
