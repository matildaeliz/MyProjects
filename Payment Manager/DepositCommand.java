package homework2;

import java.util.Scanner;

public class DepositCommand extends Operation {


public void deposit() throws Exception {
	
	
	boolean ans = actlist.isEmpty();
	
	 if (ans == true) {
			throw new Exception("You dont have any account, go and open an account to deposit");
		}
	System.out.print("Enter the Account Number: ");	
	
	
	int act2 = in.nextInt();
	
	for(int i = 0; i<actlist.size(); i++) {
		
		if(act2 == actlist.get(i)) {
			System.out.print("Enter the Amount: ");	
			
			int amount = in.nextInt();
			
	int newamount = balancelist.get(i) + amount;
			
		balancelist.set(i, newamount);	
		
		System.out.println("Account: " + act2+  "   New Balance : " + newamount);
		break;
		}else  {
			throw new Exception("Account does not exist. You cannot deposit money");	 
		}  
		
		
		
		
}  

	
	
	
}


	
}



