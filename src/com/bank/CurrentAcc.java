package com.bank;

public abstract class CurrentAcc extends BankAcc  {
	
	 private final float creditLimit;
	 
	 public float getCreditLimit() {
		return creditLimit;
	}

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
	@Override
	public void withdraw(float amount)
	{
		if(amount<=(getAccBal()+getCreditLimit()))
		{
			System.out.println("Withdraw method for current account:");
			System.out.println("Account Balance: "+getAccBal());
			System.out.println("CreditLimit: "+getCreditLimit());
			setAccBal(getAccBal()-amount);
			System.out.println("Withdrwal successful through current account.");
			
		}
		else
		{
			System.err.println("Withdraw not allowed!!");
		}
	}
	

}
