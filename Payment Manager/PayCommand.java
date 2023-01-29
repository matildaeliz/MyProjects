package homework2;

public class PayCommand extends Operation{

	
	
	
	
	
public void pay() throws Exception {
	


	boolean ans = actlist.isEmpty();
	
	 if (ans == true) {
			throw new Exception("You dont have any account, go and open an account to pay");
		}


	 System.out.print("Enter Source Account Number: ");
		int account = in.nextInt();
		
		for(int i = 0; i<actlist.size(); i++) {
			
				if(account == actlist.get(i) ){
					 
					 System.out.print("Enter the Amount: ");	
						int amount = in.nextInt();
						
						
		
						
						setamount(amount);
						
						
						int balance = balancelist.get(i) - amount;
						setBalance(balance);
						balancelist.set(i, getBalance());
						
						if(getamount() > getBalance()) {
							throw new Exception("Account balance is not enough. You cannot transfer money");
						
						}else {
						
						int ozubalance = getozubalance() + getamount();
						setozubalance(ozubalance);
						}
	     	System.out.println("Source Account: " + actlist.get(i)+ "  New Balance: "+getBalance());	
	     	break;
				}
	     	
				
				else  {
				throw new Exception("Account does not exist. You cannot transfer money");	 
			}  
			




		}
		

}















}
