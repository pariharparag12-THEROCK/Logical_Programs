package june4;

public class Keepfirstcharcterofwordandremoveremaininig4 {

	public static void main(String[] args) {
	
		String sentence ="Java And Manual";
		
		String parts[]	=	sentence.split(" ");
		
		
		String newString ="";
		
		
		for (int i=0; i<=parts.length-1; i++) {
			
			
			String firstcharacter =	 parts[i].substring(0,1);
			
			newString = newString + firstcharacter.toUpperCase();
			
			System.out.print(newString+ " ");
			
			newString="";
			
		}

	}

}
