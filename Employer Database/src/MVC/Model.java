package MVC;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


import USER.AdminUser;
import USER.EmployeeUser;
import USER.EmployerUser;
import USER.User;


public class Model {
	static final String utf8 = "utf-8";
	File newfile3 = new File("C:\\Users\\Bulend\\Desktop\\EmployeeData.txt");
	
	
	ArrayList<User> Data =  new ArrayList<User>();
	
    ArrayList<String> HashedPassword =  new ArrayList<String>();
    ArrayList<String> Username =  new ArrayList<String>();
  	
  
    ArrayList<String> ShowDataBase = new ArrayList<String>();

 
  	ArrayList<String> EmployeeDataBase = new ArrayList<String>();
  	ArrayList<String> EmployeeDataBaseSalary = new ArrayList<String>();
      
	
	  public Model() throws Exception {
		
		  Data.add(new AdminUser("Yoda", "12345"));
		  Data.add(new EmployerUser("Obiwan", "54321"));
	      Data.add(new EmployeeUser("Anakin", "01234","Cleaner","1000"));
	      Data.add(new EmployeeUser("Ahsoka", "1","Teacher","300"));
	     
	      
	      
	      // This condition prints EmployeeUsers if there is no text written in the database (assuming the DataBase is newly created)
	    if(newfile3.length() == 0) {
	    	String file3 = "C:\\Users\\Bulend\\Desktop\\EmployeeData.txt";
	    	PrintWriter pw3 = new PrintWriter(file3);
	    	for(int i= 0; i<Data.size(); i ++) {
	    		if(Data.get(i) instanceof EmployeeUser) {
	    			String namejob = ((EmployeeUser)Data.get(i)).getUsername()+" "+((EmployeeUser)Data.get(i)).getJob();
	    			String salary = ((EmployeeUser)Data.get(i)).getSalary();
	    			String hashedemployeeInfo = encrypt(namejob, generateSecretKey()) +"|"+encrypt(salary,generateSecretKey());
	    			pw3.println(hashedemployeeInfo);
	    		}
	    		
	    	}
	    	pw3.close();
	    }
	      
	      
	        
	        UsernameandPassFileWriterandArrayAdder();
	       }
	        
	  
	  
	  // This methos update the rows
	
	public void UpdateRow(int index, String name, String job,int salary) throws Exception {
		 
		String namejob = name+" "+job;
		String hashednamejob=encrypt(namejob, generateSecretKey());
		String Salary = Integer.toString(salary);
		String Hashedsalary = encrypt(Salary, generateSecretKey());
	
		EmployeeDataBase.set(index, hashednamejob);
		EmployeeDataBaseSalary.set(index, Hashedsalary);
		databaseloader();
		
		
		
    
	}

	 
	
	 
		
	
	

  
 
  
  //this Method hires the employee
  public void hireEmployee(String name,String job, int salary) throws Exception {
	
	      if(salary >= 0) {
		  
		databasereloader();
		   String namejob = name+" "+job;
		   String newSalary = Integer.toString(salary);
	       EmployeeDataBase.add(encrypt(namejob, generateSecretKey()));
		   EmployeeDataBaseSalary.add(encrypt(newSalary, generateSecretKey()));
		 
		   
		   for(int i = 0; i<EmployeeDataBase.size(); i++) {
		  if(Data.get(i) instanceof EmployerUser) {
	          ((EmployerUser)Data.get(i)).InsertRows(EmployeeDataBase, EmployeeDataBaseSalary);
			   break;
		                                          }
		   else if(Data.get(i) instanceof AdminUser){
			  ((AdminUser)Data.get(i)).InsertRows(EmployeeDataBase, EmployeeDataBaseSalary);
			   break;
		                }
		
		            }
		
    	      }
	 
	     }
  	//This method fires the Employee
  public void fireEmployee(int index) throws Exception {
	  
	 
	  
	  for(int i = 0; i<EmployeeDataBase.size(); i++) {
		  
		  if(Data.get(i) instanceof EmployerUser) {
			  ((EmployerUser)Data.get(i)).DeleteRows(EmployeeDataBase, EmployeeDataBaseSalary, index);
			  break;
		              }
		  
		  else if(Data.get(i) instanceof AdminUser){
			  ((AdminUser)Data.get(i)).DeleteRows(EmployeeDataBase, EmployeeDataBaseSalary, index);
			  break;
		          }
		
         }
		
		databaseloader();
		
		
 }
 
  
  
  
  //This Method raises the salary
  public void raiseSalary(int index, String salary) throws Exception {
	  
	
	  
	  File newfile3 = new File("C:\\Users\\Bulend\\Desktop\\EmployeeData.txt");
		
		 PrintWriter pw3 = new PrintWriter(newfile3);
		String encodeSalary = encrypt(salary,generateSecretKey());
		EmployeeDataBaseSalary.set(index, encodeSalary);
		
		for(int i = 0; i<EmployeeDataBase.size(); i++) {
	  		pw3.println(EmployeeDataBase.get(i) +"|"+EmployeeDataBaseSalary.get(i));
	  		
		   }
		  pw3.close();
		   
		  for(int i = 0; i<Data.size(); i++) {
			  String unhashed = decrypt(EmployeeDataBase.get(index), generateSecretKey());
			  int indexof = unhashed.indexOf(" ");
			  String a = unhashed.substring(0, indexof);
			  if(a.equals(Data.get(i).getUsername())){
				  ((EmployeeUser)Data.get(i)).setSalary(salary);
			  }
			  
		  }
		
		
		
		
	}

  //This method checks existence of Employee in DataBase
  public boolean checkExistenceOfEmployee(String username) throws Exception {
	  
	  boolean flag =false;
	  String  unhashed ="";
	  int indexof ;
	  String name="";
	  String job= "";
	  String data = "";
	  for(int j = 0; j<Data.size(); j++) {
		  if(Data.get(j) instanceof EmployeeUser) {
			  data = ((EmployeeUser)Data.get(j)).getJob();
		  }
	  
	for(int i = 0; i<EmployeeDataBase.size(); i++) {
		unhashed = decrypt(EmployeeDataBase.get(i),generateSecretKey());
		
	    indexof = unhashed.indexOf(" ");
		name = unhashed.substring(0, indexof);
		job = unhashed.substring(indexof+1);
		if(name.equals(username) && data.equals(job)) {
			
			flag = true;
			break;
		}else {
			flag = false;
		}
		
	}
	
	if(flag == true) {
		break;
	}
	  } 
	  
	  
	  return flag;
	  
  }

  
 //this method prints into Database 
  public void databaseloader() throws FileNotFoundException {
		
		String file3 = "C:\\Users\\Bulend\\Desktop\\EmployeeData.txt";
		  PrintWriter pw3 = new PrintWriter(file3);
		  for(int i = 0; i<EmployeeDataBase.size(); i++) {
	  		pw3.println(EmployeeDataBase.get(i) +"|"+EmployeeDataBaseSalary.get(i));
	  		
		  }
		  pw3.close();


	}
  
  
  
  
		
//Username and HashedPasswords writes in file and adds in Arrays 
  public  void  UsernameandPassFileWriterandArrayAdder() throws IOException {
		File newfile = new File("C:\\Users\\Bulend\\Desktop\\hashedpassword.txt");
    	File newfile2 = new File("C:\\Users\\Bulend\\Desktop\\username.txt");
    
    	String file1 = "C:\\Users\\Bulend\\Desktop\\hashedpassword.txt";
	    PrintWriter pw = new PrintWriter(file1);
	    String file2 = "C:\\Users\\Bulend\\Desktop\\username.txt";
	    PrintWriter pw2 = new PrintWriter(file2);
		for(int i = 0; i<Data.size(); i++) {
    		pw.println(getHashSHA1(Data.get(i).getPassword()));
    		
    	}
     pw.close();
     for(int i = 0; i<Data.size(); i++) {
    		pw2.println(Data.get(i).getUsername());
    		
    	}
     pw2.close();
     Scanner in = new Scanner(newfile);
 	 while (in.hasNextLine()) {
        String data = in.nextLine();
      HashedPassword.add(data);
        
      }
      in .close();
      Scanner in2 = new Scanner(newfile2);
  	 while (in2.hasNextLine()) {
         String data2 = in2.nextLine();
       Username.add(data2);
         
       }
       
       in2.close();
      
	  	
       if(newfile3.length() != 0) {
     EmployeeDataBase.removeAll(EmployeeDataBase);
  	 EmployeeDataBaseSalary.removeAll(EmployeeDataBaseSalary);
     Scanner in3 = new Scanner(newfile3);
        while (in3.hasNextLine()) {
	 String data3 = in3.nextLine();
     int index = data3.indexOf("|");
	 String namejob = data3.substring(0, index);
	 String salary = data3.substring(index+1);
	        
	         
	EmployeeDataBase.add(namejob);
	EmployeeDataBaseSalary.add(salary);
	         
	       }
    in3.close();
	}
  }
  
  // This method works in the hire employee method and cleans the related array and reloads it with the new posts.
 public void databasereloader() throws FileNotFoundException {
	 EmployeeDataBase.removeAll(EmployeeDataBase);
	 EmployeeDataBaseSalary.removeAll(EmployeeDataBaseSalary);
	 Scanner in3 = new Scanner(newfile3);
  	 while (in3.hasNextLine()) {
     String data3 = in3.nextLine();
     int index = data3.indexOf("|");
     String namejob = data3.substring(0,index);
     String salary = data3.substring(index+1);
        
     EmployeeDataBase.add(namejob);
     EmployeeDataBaseSalary.add(salary);
        
 }

}
		
 //hashing the passwords
 
 public String getHashSHA1(String password) throws IOException {
		 
		 try { 
	    MessageDigest md = MessageDigest.getInstance("SHA-1");
		md.update(password.getBytes());
		byte byteData[] = md.digest();
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i<byteData.length; i++) {
		sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
				
			}
			
	     return sb.toString();
	    } catch (NoSuchAlgorithmException ex) {
		Logger.getLogger("SHA-1").log(Level.SEVERE, null, ex);
	    return null;
		 }
		
	 }
	 
	 
	 
 public  SecretKey generateSecretKey() throws Exception {

     String password = "It's a secret!  Make sure it's long enough (24 bytes)";
     byte[] keyBytes = Arrays.copyOf(password.getBytes(utf8), 32);
     SecretKey key = new SecretKeySpec(keyBytes, "AES");
     return key;
 }

public  String encrypt(String plainText, SecretKey secretKey) throws Exception {
     Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
     cipher.init(Cipher.ENCRYPT_MODE, secretKey);
     byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
     String encryptedMesssageBase64 = Base64.getEncoder().encodeToString(encryptedBytes);
     return encryptedMesssageBase64;
 }

public  String decrypt(String encryptedBase64, SecretKey secretKey) throws Exception {
     byte[] encryptedBytes = Base64.getDecoder().decode(encryptedBase64);
     Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
     cipher.init(Cipher.DECRYPT_MODE, secretKey);
     byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
     String decryptedText = new String(decryptedBytes, "UTF-8");
     return decryptedText;
 }
	//Returns Employeeusers' information on their own screen
	  public String getRelatedData(String username, String userpass ) {
		  String a ="";
		  for(int i = 0; i<Data.size(); i++) {
			  if(username.equals(Data.get(i).getUsername())&& userpass.equals(Data.get(i).getPassword())) {
				  a = "                " + (((EmployeeUser)Data.get(i)).getUsername() + "              "+ ((EmployeeUser)Data.get(i)).getJob() + "               " + ((EmployeeUser)Data.get(i)).getSalary());
			  } 
		  }
		  return a;
	  }

}
