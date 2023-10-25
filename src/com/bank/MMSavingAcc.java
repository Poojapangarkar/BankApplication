package com.bank;

public class MMSavingAcc extends SavingAcc {
	
	private static final float MINBAL = 3000;

	public static float getMinbal() {
		return MINBAL;
	}
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}
	
	
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	@Override
	public void withdraw(float amount) {
		System.out.println("withdrawal Method for saving account:");
		if(getAccBal()-amount>=MINBAL)
		{
		
			System.out.println("Account Balance: "+getAccBal());
			System.out.println("Minimum balance: "+MINBAL);
			System.out.println("Amount you want to withdraw: "+amount);
			setAccBal(getAccBal() - amount);
			System.out.println("withdrawal Successful through saving account!!");
		}
		else
		{
			System.err.println("Withdrawal Not possible.Min balance in saving account.");
		}
	

	}
}
