package allLogicalPrograms;

public class RemoveSpacesFromString {

	public static void main(String[] args) {
		
		String sentence = "The Sun is a brightining star";
		
		System.out.println(sentence);
		
		String newsString=	sentence.replaceAll(" ", "");
		
		System.out.println(newsString);
	}

}
