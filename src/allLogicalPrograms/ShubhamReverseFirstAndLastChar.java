package allLogicalPrograms;

public class ShubhamReverseFirstAndLastChar {

	public static void main(String[] args) {
		
		String S = "SHUBHAM";
		
		System.out.println(S);
		
		char ch[] = S.toCharArray();
		
		reverseFirstAndLastCharacter(ch);
		
		for (int i=0; i<=ch.length-1; i++) {
			
			System.out.print(ch[i]);
		}
	}
	
	public static void reverseFirstAndLastCharacter(char ch[]) {
		
		int start = 1;
		
		int end = ch.length-2;
		
		char temp = ch[end];
		
		ch[end] = ch[start];
		
		ch[start] = temp;
		
		
	}

}
