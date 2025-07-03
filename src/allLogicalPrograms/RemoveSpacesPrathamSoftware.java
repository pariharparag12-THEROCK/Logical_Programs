package allLogicalPrograms;

public class RemoveSpacesPrathamSoftware {

	public static void main(String[] args) {


		String S = "Int er View";

		String S1 = S.replaceAll(" ", "");
		
		//System.out.print(S1);
		

		char ch[] = S1.toCharArray();


		for(int i=0; i<=ch.length-1; i++){

			System.out.print(ch[i]);
		}


	}

}
