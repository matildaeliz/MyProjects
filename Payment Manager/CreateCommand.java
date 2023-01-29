package homework2;

import java.util.Random;
import java.util.Scanner;

public class CreateCommand extends Operation{

	





	

	public void doin() {
		
		
		 
		
		
		
		
		System.out.print("Enter the Name: ");		
		String name = in.next();
		
		System.out.print("Enter the Surname: ");	
		String surname = in.next();
		
		
		System.out.print("Enter the StudentID: ");	
		String studentid = in.next();
		
		
		setName(name);
		
		setSurname(surname);
		
		setStudentid(studentid);
		
		setBalance(balance);
		
		setAccountNum(actnum);
		
		try {
			
			ListCommand.add(name, surname, studentid, balance, actnum);
			
			
			System.out.println("The account has been created");
			System.out.println("Account Number: " +actnum);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("The student is already exist");
		}
		
	
	}
	
	
	
}
