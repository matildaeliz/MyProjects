package USER;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public abstract class User implements InsertAndDeleteRows {
     private String password;
     private String username;
     
     public User(String username, String password) {
    	 this.username = username;
    	 this.password = password;
     }
     
     
     
     
     
     
     
     public  String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public void DeleteRows(ArrayList<String> EmployeeDataBase, ArrayList<String> EmployeeDataBaseSalary, int index) {
		EmployeeDataBase.remove(index);
		EmployeeDataBaseSalary.remove(index);
	}




		public void InsertRows(ArrayList<String> EmployeeDataBase, ArrayList<String> EmployeeDataBaseSalary) throws FileNotFoundException {
			
			
		  String file3 = "C:\\Users\\Bulend\\Desktop\\EmployeeData.txt";
		  PrintWriter pw3 = new PrintWriter(file3);
		  for(int i = 0; i<EmployeeDataBase.size(); i++) {
	  		pw3.println(EmployeeDataBase.get(i) +"|"+EmployeeDataBaseSalary.get(i));
		  }
		  pw3.close();
			
		}





}
