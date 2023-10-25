package com.bank;

public class Application {

	public static void main(String[] args) {
		
		BankFactory bankfactory = new MMBankFactory();
		SavingAcc savingAcc = bankfactory.getNewSavingAcc(101,"Saving Account", 15000, true);
		CurrentAcc currentAcc = bankfactory.getNewCurrentAcc(105, "Current Account", 15000,3000);
		
		System.out.println();
		savingAcc.withdraw(2000);
		System.out.println("------------------------------------------------------------");
		
		currentAcc.withdraw(12000);
		
		System.out.println(savingAcc.toString());
		System.out.println(currentAcc.toString());
		
	}

}
