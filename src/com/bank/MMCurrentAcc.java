package com.bank;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}
	
	@Override
	public void withdraw(float amount)
	{
		System.out.println("Withdraw method for current account:");
		if(amount<=(getAccBal()+getCreditLimit()))
		{
			
			System.out.println("Account Balance: "+getAccBal());
			System.out.println("CreditLimit: "+getCreditLimit());
			setAccBal(getAccBal()-amount);
			System.out.println("Withdrwal successful through current account!!");
			
		}
		else
		{
			System.err.println("Withdraw not allowed.");
		}
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	


	
	

}
