package javaCorePrac;

public class EncapMain {

	public static void main(String[] args) {
		
		EncapInfo orv = new EncapInfo();
		
		orv.setAge(30);
		orv.setId(123432189);
		orv.setName("Shubham");
		
		int a = orv.getage();
		System.out.println("Age is : "+a);
		
		
		System.out.println("Id is : "+orv.getId());
		
		String name = orv.getName();
		System.out.println("Name is : "+name);
	}

}
