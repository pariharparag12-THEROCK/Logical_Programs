package javaCorePrac;

public class BankAccount implements MasterCard{

	@Override
	public void euro() {
		System.out.println("You can pay via- EURO");
		
	}

	@Override
	public void rupees() {
		System.out.println("You can pay via- RUPEES");
		
	}

	@Override
	public void dollars() {
		System.out.println("You can pay via- DOLLARS");
		
	}

	@Override
	public void pounds() {
		System.out.println("You can pay via- POUNDS");
		
	}

	@Override
	public void Cash() {
		System.out.println("You can pay via- CASH");
		
	}

}
