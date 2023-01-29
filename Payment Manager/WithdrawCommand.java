package homework2;

public class WithdrawCommand extends Operation{


	
	
	public void withdraw() throws Exception {
		
	boolean ans = actlist.isEmpty();
		
		 if (ans == true) {
				throw new Exception("You dont have any account, go and open an account to withdraw");
			}
	
System.out.println("Enter the Account Number: ");

int act3 = in.nextInt();

for(int i = 0; i<actlist.size(); i++) {

	if(act3 == actlist.get(i)) {
		System.out.print("Enter the Amount: ");	
		int amount = in.nextInt();
		setamount(amount);
		
		
		int balance = balancelist.get(i) - amount;
		setBalance(balance);
		
	
} else  {
	throw new Exception("Account does not exist. You cannot deposit money");	 
}
	
	if(getBalance() > 0) {
	balancelist.set(i, getBalance());
	
	System.out.println("Account: " + act3+  "   New Balance : " + balancelist.get(i));
}else if (getBalance() < 0 ) {
	throw new Exception("Account balance is not enough. You cannot	withdraw money.");
}
}
	}
}
	


