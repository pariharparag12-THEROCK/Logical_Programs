package fiveFEBURARY;

public class EqualANDNotEqual {

	public static void main (String[]args) {
		
		
		String a = "Hi";
		String b = "Hi";
		
		String c = new String("hi");
		String d = new String("Hi");
		
		System.out.println(a.equals(b)); //true
		System.out.println(a.equals(c)); //false
		System.out.println(a.equals(d)); //true
		System.out.println(a.equalsIgnoreCase(c)); //true
		
		System.out.println(a==b);//true
		System.out.println(a==c);//false
		System.out.println(a==d);//false
		
	}
}
