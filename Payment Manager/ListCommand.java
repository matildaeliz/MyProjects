package homework2;

import java.util.ArrayList;

public class ListCommand extends Operation {

	
	
	
	public static void show() {
		
		System.out.println("Students in System:");
		
		for(int i = 0; i<namelist.size(); i++) {
			
		
			
			System.out.println("Name: " + namelist.get(i) );
			System.out.println("Surname: " +surnamelist.get(i));
			System.out.println("StudentID: " + idlist.get(i));
			System.out.println("Balance: " + balancelist.get(i));
			System.out.println("Account Number: " + actlist.get(i));
			System.out.println("_______________________________");
		}
	}
	
	
	
	
}
