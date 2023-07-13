class BankAccountTester{
	

public static void main(String bank[]){

 BankAccount.credit(10000);
 
double balance = BankAccount.getBalance();

 System.out.println(balance);
 BankAccount.debit(2000);

double balance1 = BankAccount.getBalance();
System.out.println(balance1);
 BankAccount.credit(500);
 BankAccount.credit(1000);
 BankAccount.credit(3000);
 BankAccount.credit(10000);
 double balance2 = BankAccount.getBalance();
 System.out.println(balance2);
  BankAccount.debit(200);
   BankAccount.debit(2000);
    BankAccount.debit(300);
	 BankAccount.debit(5000);
	System.out.println(BankAccount.getBalance());
 

}


}