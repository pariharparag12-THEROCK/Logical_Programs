package september1;

public class RemoveSpacesFromString {

	public static void main(String[] args) {

		String sentence = "The Sun is a brightining star";
		
		String newString1 = sentence.replaceAll(" ", "");
		
		System.out.println(newString1);

	}

}
