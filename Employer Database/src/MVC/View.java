package MVC;




import java.awt.ScrollPane;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class View  {
	Model model;
          

 JTextArea area,area2;
 JButton signinbutton,exitbutton,showDatabase,hireEmployee, fireEmployee, raiseSalary,showDatabase2,backtologinpage,return1,return2,updaterow,backtologinpage2,return3,backtologinpage3;

 JTextField userText,userPassword,jobText,salaryText,indexText, index2Text, salary2Text,job2Text,salary3Text,name2Text,nameText,index3Text;

 JFrame frame,employerFrame,employeeFrame ,adminFrame,employeeFrame2,employeePage;


	
	public View () throws Exception  {
		model = new Model();
		login();
		
	}
	

	
	public void  login() throws IOException  {
		//frame//
		
		
     frame  = new JFrame("Sign In");
	 JPanel panel = new JPanel();
	    panel.setLayout(null);
	    panel.setVisible(true);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(700, 500);
	    frame.setResizable(false);
        frame.add(panel);
   
        //subtitle
       JLabel subtitle = new JLabel("Sign In");   
       subtitle.setBounds(15, 0, 40, 25);
           panel.add(subtitle);
           
           //username and textfield//
       JLabel username = new JLabel("Username");
         username.setBounds(250, 180, 80, 25);
         panel.add(username);
         userText = new JTextField();
         userText.setBounds(320, 180, 160, 25);
         panel.add(userText);
      
         //password and textfield//
         JLabel password = new JLabel("Password");
         password.setBounds(250, 210, 80, 25);
         panel.add(password);
        userPassword = new JTextField();
         userPassword.setBounds(320, 210, 160, 25);
         panel.add(userPassword);
	   
         //signin button//
         signinbutton = new JButton("Sign In");
	     signinbutton.setBounds(280, 240, 90, 30);
	     panel.add(signinbutton); 
	    signinbutton.addActionListener(new Controller(this,model));
	 	
	    
	    //exit button//
	     exitbutton = new JButton("Exit");
	     exitbutton.setBounds(380, 240, 90, 30);
	     panel.add(exitbutton);
	     exitbutton.addActionListener(new Controller(this,model));
        
	     frame.setVisible(true); 
	
	     
	     
 } public void EmployerPanel() throws IOException {
	 //Employer Frame
	 employerFrame = new JFrame("Employer Page");
	 JPanel employerPanel = new JPanel();
	 employerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 employerFrame.setSize(700, 500);
	 employerFrame.setResizable(false);
     employerFrame.add(employerPanel);
    
       employerPanel.setLayout(null);
     frame.dispose();
  //DataBase Button
     showDatabase = new JButton("Show Database");
     showDatabase.setBounds(220, 60, 300, 30);
     employerPanel.add(showDatabase);
     showDatabase.addActionListener(new Controller(this,model));
  //Name label, text   
    JLabel name = new JLabel("Name");
    name.setBounds(230, 100, 60, 25);
    employerPanel.add(name);
    nameText = new JTextField();
    nameText.setBounds(220, 120, 60, 25);
    employerPanel.add(nameText);
    //Job Label, text  
    JLabel job = new JLabel("Job");
    job.setBounds(298, 100, 80, 25);
    employerPanel.add(job);
    jobText = new JTextField();
    jobText.setBounds(280, 120, 60, 25);
    employerPanel.add(jobText);
   
    //Salary Label, text  
    JLabel salary = new JLabel("Salary");
    salary.setBounds(350, 100, 80, 25);
    employerPanel.add(salary);
    salaryText = new JTextField();
    salaryText.setBounds(340, 120, 60, 25);
    employerPanel.add(salaryText);
    
    //Hire Button
    hireEmployee = new JButton("Hire Employee");
    hireEmployee.setBounds(400, 120, 120, 25);
    employerPanel.add(hireEmployee);
    hireEmployee.addActionListener(new Controller(this,model));
    
    //Index Label, text  
    JLabel index = new JLabel("Index");
    index.setBounds(230, 150, 60, 25);
    employerPanel.add(index);
    indexText = new JTextField();
    indexText.setBounds(220, 170, 180, 25);
    employerPanel.add(indexText);
    
    //Fire Button
    fireEmployee = new JButton("Fire Employee");
    fireEmployee.setBounds(400, 170, 120, 25);
    employerPanel.add(fireEmployee);
    fireEmployee.addActionListener(new Controller(this,model));
    //Index and Salary Label,Text,
    JLabel index2 = new JLabel("Index");
    employerPanel.add(index2);
    index2.setBounds(230, 200, 120, 25);
    index2Text = new JTextField();
    index2Text.setBounds(220, 220, 100, 25);
    employerPanel.add(index2Text);
    
    
    JLabel salary2 = new JLabel("Salary");
    salary2.setBounds(340, 200, 120, 25);
    employerPanel.add(salary2);
    salary2Text = new JTextField();
    salary2Text.setBounds(320, 220, 80, 25);
    employerPanel.add(salary2Text);
    
    //RaiseSalary Button and Exit Button
    
    raiseSalary = new JButton("Raise Salary");
    raiseSalary.setBounds(400, 220, 120, 25);
    employerPanel.add(raiseSalary);
    raiseSalary.addActionListener(new Controller(this,model));
    backtologinpage = new JButton("Exit");
    backtologinpage.setBounds(220, 260, 300, 30);
    backtologinpage.addActionListener(new Controller(this,model));
    employerPanel.add(backtologinpage);
    
    
    employerFrame.setVisible(true);
 }
 
 public void showDataBase() throws IOException{
	 employerFrame.dispose();
	 employeeFrame = new JFrame("Employee Database");
	 JPanel employeePanel = new JPanel();
	 employeeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 employeeFrame.setSize(700, 500);
	 employeeFrame.setResizable(false);
     employeeFrame.add(employeePanel);
   
     employeePanel.setLayout(null);
   
  
    
    JLabel namejobsalary = new JLabel("NAME    JOB     SALARY");
    employeePanel.add(namejobsalary);
    namejobsalary.setBounds(270, 50, 300, 30);
   

    return1 = new JButton("Return");
    return1.setBounds(270, 360, 150, 30);
    employeePanel.add(return1);
    return1.addActionListener(new Controller(this,model));
  
    
    area=new JTextArea();  
     
    area.setEditable(false);
    area.setBounds(270, 95, 150, 260);
    employeePanel.add(area);
   
  

    employeeFrame.setVisible(true); 
 }


 public void AdminPage() throws IOException {
 adminFrame = new JFrame("Admin Page");
 JPanel adminPanel = new JPanel();
 adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 adminFrame.setSize(700, 500);
 adminFrame.setResizable(false);
 adminFrame.add(adminPanel);
 
   adminPanel.setLayout(null);
 frame.dispose();
//DataBase Button
 showDatabase2 = new JButton("Show Database");
 showDatabase2.setBounds(220, 60, 300, 30);
 adminPanel.add(showDatabase2);
 showDatabase2.addActionListener(new Controller(this,model));
//Name label, text   
JLabel name = new JLabel("Name");
name.setBounds(230, 100, 60, 25);
adminPanel.add(name);
nameText = new JTextField();
nameText.setBounds(220, 120, 60, 25);
adminPanel.add(nameText);
//Job Label, text  
JLabel job = new JLabel("Job");
job.setBounds(298, 100, 80, 25);
adminPanel.add(job);
jobText = new JTextField();
jobText.setBounds(280, 120, 60, 25);
adminPanel.add(jobText);

//Salary Label, text  
JLabel salary = new JLabel("Salary");
salary.setBounds(350, 100, 80, 25);
adminPanel.add(salary);
salaryText = new JTextField();
salaryText.setBounds(340, 120, 60, 25);
adminPanel.add(salaryText);

//Hire Button
hireEmployee = new JButton("Add Row");
hireEmployee.setBounds(400, 120, 120, 25);
adminPanel.add(hireEmployee);
hireEmployee.addActionListener(new Controller(this,model));

//Index Label, text  
JLabel index = new JLabel("Index");
index.setBounds(230, 150, 60, 25);
adminPanel.add(index);
indexText = new JTextField();
indexText.setBounds(220, 170, 180, 25);
adminPanel.add(indexText);

//Fire Button
fireEmployee = new JButton("Delete Row");
fireEmployee.setBounds(400, 170, 120, 25);
adminPanel.add(fireEmployee);
fireEmployee.addActionListener(new Controller(this,model));
//Index and Salary Label,Text,
JLabel index3 = new JLabel("Index");
adminPanel.add(index3);
index3.setBounds(230, 200, 70, 25);
index3Text = new JTextField();
index3Text.setBounds(220, 220, 55, 25);
adminPanel.add(index3Text);

JLabel name2 = new JLabel("Name");
adminPanel.add(name2);
name2.setBounds(280, 200, 70, 25);
name2Text = new JTextField();
name2Text.setBounds(275, 220, 55, 25);
adminPanel.add(name2Text);

JLabel job2 = new JLabel("Job");
adminPanel.add(job2);
job2.setBounds(343, 200, 70, 25);
job2Text = new JTextField();
job2Text.setBounds(330, 220, 55, 25);
adminPanel.add(job2Text);

JLabel salary3 = new JLabel("Salary");
adminPanel.add(salary3);
salary3.setBounds(387, 200, 70, 25);
salary3Text = new JTextField();
salary3Text.setBounds(385, 220, 55, 25);
adminPanel.add(salary3Text);

updaterow = new JButton("Update Row");
updaterow.setBounds(439, 220, 105, 24);
adminPanel.add(updaterow);
updaterow.addActionListener(new Controller(this,model));





backtologinpage2 = new JButton("Exit");
backtologinpage2.setBounds(220, 260, 300, 30);
backtologinpage2.addActionListener(new Controller(this,model));
adminPanel.add(backtologinpage2);
adminFrame.setVisible(true);





}
public void showDataBase2() throws IOException{
	 adminFrame.dispose();
	 employeeFrame2 = new JFrame("Employee Database");
	 JPanel employee2Panel = new JPanel();
	 employeeFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 employeeFrame2.setSize(700, 500);
	 employeeFrame2.setResizable(false);
     employeeFrame2.add(employee2Panel);
  
     employee2Panel.setLayout(null);
  
 
   
     JLabel namejobsalary = new JLabel("NAME    JOB     SALARY");
     employee2Panel.add(namejobsalary);
     namejobsalary.setBounds(270, 50, 300, 30);
  

     return2 = new JButton("Return");
     return2.setBounds(270, 360, 150, 30);
     employee2Panel.add(return2);
     return2.addActionListener(new Controller(this,model));
 
   
    area=new JTextArea();  
    
    area.setEditable(false);
    area.setBounds(270, 95, 150, 260);
    employee2Panel.add(area);

    employeeFrame2.setVisible(true); 
}



public void EmployeePage() throws IOException {
	frame.dispose();
	employeePage = new JFrame("Employee Page");
	
	JPanel emp = new JPanel();
	employeePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	employeePage.setSize(700,500);
	employeePage.setResizable(false);
	employeePage.add(emp);
	emp.setLayout(null);
	 JLabel namejobsalary = new JLabel("NAME    JOB     SALARY");
	 namejobsalary.setBounds(270, 50, 300, 30);
	 emp.add(namejobsalary);
	
	 
	 area2=new JTextArea();   
	  area2.setEditable(false);
	  area2.setBounds(190, 95, 300, 40);
	  emp.add(area2);
	 
	  
	  backtologinpage3 = new JButton("Exit");
	  backtologinpage3.setBounds(190, 260, 300, 30);
	  backtologinpage3.addActionListener(new Controller(this,model));
	  emp.add(backtologinpage3);
	 
	 employeePage.setVisible(true);
}
}
