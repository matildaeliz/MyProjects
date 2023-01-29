package USER;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import MVC.Model;

public interface InsertAndDeleteRows {
  

	
	public void DeleteRows(ArrayList<String> EmployeeDataBase, ArrayList<String> EmployeeDataBaseSalary, int index);
	public void InsertRows(ArrayList<String> EmployeeDataBase, ArrayList<String> EmployeeDataBaseSalary) throws FileNotFoundException;
}
