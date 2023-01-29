package homework2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Operation {
	
	
	public static  ArrayList<String> namelist = new ArrayList <String>();
	public static  ArrayList<String> surnamelist = new ArrayList <String>();
	public static  ArrayList<String> idlist = new ArrayList <String>();
	public static  ArrayList<Integer> balancelist = new ArrayList <Integer>();
	public static  ArrayList<Integer> actlist = new ArrayList <Integer>();
	
	Random dice = new Random();
	Scanner in = new Scanner(System.in);
	
		protected static  String name;
		protected String surname;
		protected static String studentid;
		protected int balance = 0;
		protected int actnum = dice.nextInt(999999999);
	    protected int amount;
		protected int newamount;
		
		Random ozu = new Random();
		
	private String ozuname = "OZUAccount";
	private int ozubalance = 0;
	private int ozuactnum = ozu.nextInt(999999999);
		
	
	
	
	public int getozubalance() {
			return ozubalance;
		}
		public void setozubalance(int ozubalance) {
			this.ozubalance = ozubalance;
		}
		
		
		
		public static  String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		
		
		public String getSurname() {
		 return surname; 
		}
		
		public void setSurname(String surname) {
			this.surname = surname;
		
		}
		
		
		public static String getStudentid() {
			
			return studentid;
		}

		public void setStudentid(String studentid) {
			this.studentid = studentid;
		

		
	}public int getBalance() {
		return balance;
		
	}public void setBalance(int balance) {
		this.balance = balance;
	}
		



	public int getAccountNum() {
		return actnum;
	}
		
	public void setAccountNum(int actnum) {
		this.actnum = actnum;
	}
	
	public int getamount() {
		return amount;
	}
	
	public void setamount(int amount) {
		this.amount = amount;
	}
	

	
	
	public static void add(String name, String surname, String studentid, int balance, int actnum) throws Exception {
		
		control(getStudentid());
		namelist.add(name);
		surnamelist.add(surname);
		idlist.add(studentid);
		balancelist.add(balance);
		actlist.add(actnum);
		
	}

	private static void control(String studentid) throws Exception {

		for(int i = 0; i<idlist.size(); i++) {
			
			
			if(getStudentid().equals(idlist.get(i))) {
				throw new Exception("StudendID is already exists");
			}
	}
		
	}
}

