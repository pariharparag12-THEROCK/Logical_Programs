package november8;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		
		String sentence = "The Sun is a brightining star";
		System.out.println(sentence);
		
		String newString = sentence.replaceAll(" ", "");
		System.out.println(newString);
	}

}
