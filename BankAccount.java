class BankAccount{
  
 static double currentBal;
 
 public static boolean credit(int amount){
	 boolean isCredited = false;
  if(amount>0){
   currentBal=currentBal+amount;
   isCredited=true;
  
   System.out.println("Current Balance is "+currentBal);
  }
  return isCredited;
   
 }
 public static boolean debit(int amount){
	 boolean isDebited = false;
 if(amount<=currentBal){
  currentBal=currentBal-amount;
  isDebited=true;
 System.out.println("Current Balance is "+currentBal);
 
  }
return isDebited;
 }
 
 public static double getBalance(){
	 System.out.println("Remaining balance is");
	 return currentBal;
 }
}