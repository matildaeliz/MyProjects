package homework2;

import java.util.Scanner;

public class PaymentManagerS018752    {

	
	
	public static void main(String args[]) throws Exception{
		  
		
		                                                                 //First of all, I opened the superclass called operation and I threw 
		                                                                //  all the operations into it and extended them to all of them, then I opened separate classes for all the necessary
		                                                                // commands and wrote the necessary codes for that command to run.

		
		
		//Upcasting means converting an object created from subclasses to 
		//superclasses. If there is the same method in both the upper class and the lower class,
		//we create an object where necessary and give the first head the name of the parent class, and thus we are upcasting.
		
		System.out.println("Welcome to OZUPay System!!");
	
		HelpCommand help = new HelpCommand();
		
		help.doing();
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the Command: ");
		
		String command = sc.next();
	
		if(command.equals("list")) {
			ListCommand lister = new ListCommand();
	
		lister.show();
		
		}else if (command.equals("create")) {
			CreateCommand creater = new CreateCommand();
			
		creater.doin();
			
			
		}else if (command.equals("deposit")) {
			DepositCommand depositer = new DepositCommand();
			depositer.deposit();
		}else if (command.equals("withdraw")) {
			WithdrawCommand withdrawer = new WithdrawCommand();
			withdrawer.withdraw();
		}else if (command.equals("transfer")) {
			TransferCommand transferer = new TransferCommand();
			transferer.transfer();
		}else if (command.equals("pay")) {
			PayCommand payer = new PayCommand();
			payer.pay();
		
		}
		
		else {
			System.out.println("Unknown Command");
		}
		}
	}


	
	
		
	}

