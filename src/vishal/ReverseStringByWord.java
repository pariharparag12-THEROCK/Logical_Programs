package vishal;



public class ReverseStringByWord {

	public static void main(String[] args) {
		

		String sentence = "Life is a beautiful enjoy it";
		
		String parts[] = sentence.split(" ");
		
		for(int i=parts.length-1 ; i>=0; i--) {

			System.out.print(parts[i]+ " ");
		}
		
	}
}
