package homework2;

public class TransferCommand extends Operation {

	public void transfer () throws Exception {
		
		
		boolean ans = actlist.isEmpty();
			
			 if (ans == true) {
					throw new Exception("You dont have any account, go and open an account to transfer");
				}
		
		
		System.out.print("Enter Source Account Number: ");
		int source = in.nextInt();
		
		for(int i = 0; i<actlist.size(); i++) {
			
				if(source == actlist.get(i) ){
					 
					 System.out.print("Enter the Amount: ");	
						int amount = in.nextInt();
						setamount(amount);
						
						
						int balance = balancelist.get(i) - amount;
						setBalance(balance);
						balancelist.set(i, getBalance());
						if(getamount()> getBalance()) {
							throw new Exception("Account balance is not enough. You cannot transfer money");
						}
	     	System.out.println("Source Account: " + actlist.get(i)+ "  New Balance: "+getBalance());	
	     	break;
				}
	     	else  {
				throw new Exception("Account does not exist. You cannot transfer money");	 
			}  
				
			}
			


		
			System.out.print("Enter Dastination Account Number: ");
			int destination = in.nextInt();
			for(int i = 0; i<actlist.size(); i++) {
				
				if(source == actlist.get(i) ){
					 
						int balance = balancelist.get(i) + amount;
						setBalance(balance);
						balancelist.set(i, getBalance());
						System.out.println("Destination Account: " + actlist.get(i)+ "  New Balance: "+getBalance());
				break;
				} else {
					throw new Exception("Account does not exist. You cannot transfer money");
				}
				}
	     	
				
			}

}
								
				
			
			
			
			
			
			
			
			
		
			
			
	
			





