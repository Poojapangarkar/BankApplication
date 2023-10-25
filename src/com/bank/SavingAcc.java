package com.bank;

public abstract class SavingAcc extends BankAcc{

	private boolean isSalaried;
	private static final float MINBAL = 3000;
	
	
	public boolean isSalaried() {
		return isSalaried;
	}

	public static float getMinbal() {
		return MINBAL;
	}
	
	

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	@Override
	public void withdraw(float amount) {
	if(getAccBal()-amount>=MINBAL)
	{
		System.out.println("withdrawal Method for saving account:");
		System.out.println("Account Balance: "+getAccBal());
		System.out.println("Minimum balance: "+MINBAL);
		System.out.println("Amount you want to withdraw: "+amount);
		setAccBal(getAccBal() - amount);
		System.out.println("withdrawal Successful through saving account.!!");
	}
	else
	{
		System.err.println("Withdrawal Not possible.Min balance in saving account.");
	}
}
	
	
}
