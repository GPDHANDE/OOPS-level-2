package org.ContractPod.OopsL2;

public class Program3_BankAccount 
{
	String accountNumber;
	double balence;
	
	
	Program3_BankAccount(String accountNumber, double balence) 
	{
		this.accountNumber = accountNumber;
		this.balence = balence;
	}

	public double deposit(double depositMoney)
	{
		balence = balence + depositMoney;
		return balence;
	}
	
	public double withdraw(double withdrawMoney)
	{
		balence = balence - withdrawMoney;
		return balence;
	}
	static
	{
		System.out.println("welcome to SBI ATM");
	}
	public static void main(String[] args) 
	{
		Program3_BankAccount bankAccount = new Program3_BankAccount("38499144352", 100000);
		System.out.println(bankAccount.deposit(15000)+ " rs is deposited in your bank account");
		System.out.println(bankAccount.withdraw(15000)+ " rs is withdrawn from your bank account");
		
		System.out.println("Thank you for choosing SBI ATM");
	}


}
