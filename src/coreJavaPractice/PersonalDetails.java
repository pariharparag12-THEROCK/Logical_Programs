package coreJavaPractice;

public abstract class PersonalDetails {
	
	public void welocome() {
		System.out.println("Welcome to the Jungle");
	}
	
	abstract public void name();
	
	abstract public void accountName();
	
	public static void Check() {
		System.out.println("Personal Details - Checked");
	}
	

}
