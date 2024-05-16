package sixteenmarch;

public class EqualsANDNotEQUALs {

	public static void main(String[] args) {
		
		String a = "Hi";
		String b =  "hi";
		
		String c = new String("hi");
		String d = new String("Hi");
		
		System.out.println(a==b);         		 //false
		System.out.println(a.equals(b));   			//false
		System.out.println(a.equalsIgnoreCase(b)); //True
		System.out.println(a.equals(c));				//false
		System.out.println(a.equals(d));				 // True
		System.out.println(a.equalsIgnoreCase(c));    //True
		
		System.out.println(a==c);  //false
		System.out.println(a==d); //false
	}

}
