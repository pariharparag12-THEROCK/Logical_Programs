package coreJavaPractice;

public class EncapMain {

	public static void main(String[] args) {
		
		EncapInfo orv =new EncapInfo();
		
		orv.setName("RAM");
		orv.setID("Ram1234@gmail.com");
		orv.setAge(30);
		
		String n = orv.getName();
		String ID = orv.getId();
		int age = orv.getAge();
		
		System.out.println(n+"\n"+ID+"\n"+age);
		
		System.out.println();
		
		System.out.println(orv.getName()+"\n"+orv.getId()+"\n"+orv.getAge());
		
		
		
		
		}

}
