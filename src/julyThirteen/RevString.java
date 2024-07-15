package julyThirteen;

public class RevString {

	public static void main(String[] args) {
		
		String sentence = "Life is a beautiful enjoys it";
		
		String parts[] = sentence.split(" ");
		
		for (int i=parts.length-1; i>=0; i--) {
			
			System.out.print(parts[i]+" ");
		}

	}

}
