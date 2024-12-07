package encapsulation;
 class BankBalance {
	 private String AccountNumber;
	 private double Balance;
	 
	 BankBalance(String AccountNumber, double Balance)
	 {
		 this.AccountNumber = AccountNumber;
		 this.Balance = Balance;
	 }
	 public String getAccountNumber()
	 {
		 return AccountNumber;
	 }
	 
	 public double getBalance()
	 {
		 return Balance;
	 }
	 
	 public void deposit(int Amount)
	 {
		 if(Amount>0)
		 {
			 Balance = Amount+Balance;
			 System.out.println("Deposited Amount:"+Amount);
			 System.out.println("Current Balance:"+Balance);
		 }
			 else {
				 System.out.println("Amount must be positive");
				 
			 }
				
	 }
}
public class BankAccount {
	public static void main(String args[])
	{
	BankBalance obj = new BankBalance("123456789", 500);
	System.out.println(obj.getAccountNumber());
	System.out.println(obj.getBalance());
	obj.deposit(500);
	}}