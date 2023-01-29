package MVC;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import USER.AdminUser;
import USER.EmployeeUser;
import USER.EmployerUser;

public class Controller implements ActionListener  {
  
	Model model;
	View view;
	

	
	public Controller(View view, Model model) throws IOException {
		
		this.view = view;
		this.model = model;
	
	}
	
	// action method//
	
	public void actionPerformed(ActionEvent e) {
	
		String username = view.userText.getText();
		String userpass = view.userPassword.getText();
		String convertedpass = "";
		
				try {
					convertedpass = model.getHashSHA1(userpass);
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
	   
				
		if(e.getSource() == view.signinbutton) {
			
		
			
			
				if(model.Username.indexOf(username) == model.HashedPassword.indexOf(convertedpass) && model.Username.contains(username)) {
					
					for(int i = 0; i<model.Data.size(); i++) {
						if(model.Data.get(i) instanceof AdminUser && username.equals(model.Data.get(i).getUsername())) {
							try {
								view.AdminPage();
								
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						   } else if (model.Data.get(i) instanceof EmployerUser && username.equals(model.Data.get(i).getUsername())) {
							try {
								view.EmployerPanel();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					       }else if (model.Data.get(i) instanceof EmployeeUser && username.equals(model.Data.get(i).getUsername())) {
					      try {
					    	  //It checks if there is such an employee user in the database.
					    	 if(model.checkExistenceOfEmployee(username) == true) {
					    		view.EmployeePage();
					    		view.area2.setText(model.getRelatedData(username,userpass));
					    	 }else {
					    		 JOptionPane.showMessageDialog(view.frame, "Invalid Username or Password");
					    	 }
							
						
							
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
                             				    	  
					       }
					}
				} else {
					JOptionPane.showMessageDialog(view.frame, "Invalid Username or Password");
					}
			
		}
		
		if(e.getSource() == view.backtologinpage) {
			
			if(view.employerFrame.isActive()) {
				view.employerFrame.setVisible(false);
				try {
					view.login();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}                                                                               
	
		}
		
        if(e.getSource() == view.backtologinpage2) {                            //3 back to login pages were created to avoid the Null Pointer exception error//
			
			if(view.adminFrame.isActive()) {
				view.adminFrame.setVisible(false);
				try {
					view.login();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
	
		}
		
         if(e.getSource() == view.backtologinpage3) {
	
	         if(view.employeePage.isActive()) {
	          	view.employeePage.setVisible(false);
		       try {
			   view.login();
		}    catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}

		
		
		
		if(e.getSource() == view.hireEmployee) {
		

			String  name = view.nameText.getText();
			String  job = view.jobText.getText();
			int salary = 0;
			if(name.isBlank() || job.isBlank()) {
				JOptionPane.showMessageDialog(view.frame,"All boxes must be filled");
			}else {
			try {
				salary = Integer.parseInt(view.salaryText.getText());
				String salarylook = Integer.toString(salary);
				if(salarylook.isBlank()) {
					JOptionPane.showMessageDialog(view.frame, "Enter Valid Salary");
				}else {
					
					
						if(salary < 0) {
							JOptionPane.showMessageDialog(view.frame, "Salary must be 0 or grater");
						}else {
							
							try {
							    model.hireEmployee(name,job,salary);
									
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
						}
						}
					
				
				
			} catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(view.frame, "Enter Valid Salary");
			}
			
		} 
		}
	   	if(e.getSource() == view.fireEmployee) {
			
			try {
				int index = Integer.parseInt(view.indexText.getText());
				model.fireEmployee(index);
				
				
				
				
				
				
			}catch(NumberFormatException | IndexOutOfBoundsException | FileNotFoundException nfe) {
				JOptionPane.showMessageDialog(view.frame, "Enter Valid Index Number");
		
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
		}
		
		if(e.getSource() == view.raiseSalary) {
			try {
				
			int index = Integer.parseInt(view.index2Text.getText());
			String salary =view.salary2Text.getText();
			int newsalary = Integer.parseInt(salary);
			int hashedsalary = Integer.parseInt(model.decrypt(model.EmployeeDataBaseSalary.get(index), model.generateSecretKey()));
			
			if(newsalary > hashedsalary) {
				model.raiseSalary(index, salary);
			}else {
				JOptionPane.showMessageDialog(view.frame, "You need te enter higher salary than previous one");
			}
			
			
			} catch (NumberFormatException | IndexOutOfBoundsException | FileNotFoundException nfee1) {
				JOptionPane.showMessageDialog(view.frame, "Enter Valid Index Number or Salary");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} 
		if(e.getSource() == view.showDatabase) {
			
			try {
				
			view.showDataBase();
			liste();
			
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}if(e.getSource() == view.return1) {
			view.employeeFrame.dispose();
			try {
			    
				view.EmployerPanel();
			}
			 catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
        if(e.getSource() == view.showDatabase2) {
			
			try {
				
			view.showDataBase2();
			liste();
			
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}if(e.getSource() == view.return2) {
			view.employeeFrame2.dispose();
			try {
			    
				view.AdminPage();
			}
			 catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	 
			
		
		if(e.getSource() == view.updaterow) {
			try {
			int index  = Integer.parseInt(view.index3Text.getText());
			String  name = view.name2Text.getText();
			String  job = view.job2Text.getText();
			int salary = Integer.parseInt(view.salary3Text.getText());
              String salarylook = Integer.toString(salary);
			
			
			
			if(name.isBlank() || job.isBlank() || salarylook.isBlank() ) {
				JOptionPane.showMessageDialog(view.frame, "All boxes must be filled");
			}else {
				if(salary < 0) {
					JOptionPane.showMessageDialog(view.frame, "Salary must be 0 or greater");
				}else {
					model.UpdateRow(index, name, job, salary);
				}
					
				
				
			}
			
		
		}catch (NumberFormatException | IndexOutOfBoundsException nfee1) {
			JOptionPane.showMessageDialog(view.frame, "Enter Valid Index Number or Salary"); {
			
		}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}
		 
		
		else if(e.getSource() == view.exitbutton ) {
			System.exit(0);
		}
		
		
		
	}
	
	
	//This method Collects the data in the model with the image in the view and shows the DataBase
	
	public void liste() throws Exception{
		
		String a = "";
	for(int i = 0; i<model.EmployeeDataBase.size(); i++) {
	   	
		
		a+= model.decrypt(model.EmployeeDataBase.get(i), model.generateSecretKey())+" "+ model.decrypt(model.EmployeeDataBaseSalary.get(i), model.generateSecretKey())+ "\n";
	}
	view.area.setText(a);
	
}
	
	
		 }
	
		
	 
	
		
	
  
		

