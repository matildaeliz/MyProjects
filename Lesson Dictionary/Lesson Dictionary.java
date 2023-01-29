package homework4;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class LessonDictionaryS018752 {

public static ArrayList<String> lesson = new ArrayList<String>();


public static ArrayList<String> word = new ArrayList<String>();


public static ArrayList<String> meaning = new ArrayList<String>();



	public static void main(String[] args) throws Exception  {

		String filename = args[0];
		
		File inputFile = new File(filename);
		
		Scanner in = new Scanner(inputFile);                   //this codes reads the file//
		
		while (in.hasNextLine()) {   
			String line  = in.nextLine();
			String line2  = in.nextLine();
			String line3  = in.nextLine();
					
					lesson.add(line);
					word.add(line2);
					meaning.add(line3);
		 
		}
	

	in.close();
	 System.out.println("**************");
	 System.out.println("*  Commands  *");
	 System.out.println("**************");
	 System.out.println("*   add      *");
	 System.out.println("*   update   *");
	 System.out.println("*   delete   *");
	 System.out.println("*   list     *");
	 System.out.println("*   search   *");
	 System.out.println("*   save     *");
	 System.out.println("*   sort     *");
	 System.out.println("**************");	
		
		 while (true){
		
			 Scanner s = new Scanner(System.in);
			 
			
			 System.out.println("");
	            System.out.print("Enter the command : ");
	    
	            
	            switch (s.next()){
	                case "add": add(); break;
	                case "list": list(); break;
	                case "save": save(filename); break;
	                case "delete": delete(); break;
	                case "update": update(); break;
	                case "search": search(); break;
	                case "sort": sort(); break;
	                
	                default: System.out.println("Please enter a valid command."); break;
                 }
	            
	         }
	}
	
	
	
	
	
	
	public static void add() throws Exception {
        Scanner sc = new Scanner(System.in);
       
        boolean helo = false;
        String word1 = null;
        
        System.out.print("Lesson: ");
        String lesson1 =  sc.nextLine();
      
       do {
    	                                                              //This code add's new lessons word and meaning//
        try {
        	System.out.print("Word: ");
             word1 =  sc.nextLine();
            
        for(int i=0;i<word.size();i++) {
        	if (word.get(i).equals(word1) && lesson.get(i).equals(lesson1)) {
        		throw new Exception("The word is already existed");
             }
          }
        helo = false;
        }
        catch(Exception e) {
        	System.out.println(e);
        	helo = true;
        }
       } while(helo);
       
        
        System.out.print("Meaning: ");
        String meaning1 =  sc.nextLine();

        lesson.add(lesson1);
        word.add(word1);
        meaning.add(meaning1);
        

}
	
	
	 public static void save(String filename) throws Exception{

	        PrintWriter out = new PrintWriter(filename);

	        for(int i=0;i<lesson.size();i++){
	            out.println(lesson.get(i));
	            out.println(word.get(i));                        //This code write the lesson word and meaning on file//
	            out.println(meaning.get(i));
	           
	        }  
	            out.close();                               
	            
	 }	        
	        
	 
	        
	 public static void delete() {
		   Scanner sc = new Scanner(System.in);
		   String deleting = null;
		   boolean keko = false;  
	do {	   
	try {
	
	
		 System.out.println("Enter the word : ");
		                                                            //this code deletes word meaning and lesson//
		 deleting =  sc.nextLine();
		 
		 for(int z=0;z<word.size();z++) {
        	 if(word.get(z).equals(deleting)) {
        	   System.out.println("Lesson:" + lesson.get(z));
        	   System.out.println("Word:" + word.get(z));
        	   System.out.println("Meaning:" + meaning.get(z));
        	   keko = true;
		 }
		 }
		 
        	 if(keko == false)
        		 throw new Exception("There is no such word");
		 
	} 
	catch(Exception a) {
		System.out.println(a);
	}
	} while(keko == false);
		 System.out.println("Are you sure? : ");
		 String sure=  sc.nextLine();
		 
		 if(sure.equals("yes")) {
		 for(int o=0;o<word.size();o++) {
	        	 if(word.get(o).equals(deleting)) {
	        		 word.remove(o);
	        		 lesson.remove(o);
	        		 meaning.remove(o);
	        		 System.out.println("Successfully Deleted. Don't forget to save ");
	        	 }
		 }
	        }
		 
		 
	
	 
	 }
	 
	

	public static void update() {
		
		  Scanner sc = new Scanner(System.in);
		  String updating = null;
		   boolean degi = false;  
	do {	   
	try {
	
	
		 System.out.println("Enter the word : ");
		 
		 updating =  sc.nextLine();                         //this code updates the meaning//
		 
		 for(int q=0;q<word.size();q++) {
       	 if(word.get(q).equals(updating)) {
       	   System.out.println("Lesson:" + lesson.get(q));
       	   System.out.println("Word:" + word.get(q));
       	   System.out.println("Meaning:" + meaning.get(q));
       	   degi = true;
		 }
		 }
		 
       	 if(degi == false)
       		 throw new Exception("There is no such word");
		 
	} 
	catch(Exception c) {
		System.out.println(c);
	}
	} while(degi == false);
		
	System.out.println("Change the meaning : ");
	  String chancing =  sc.nextLine();
	  
	  for(int k=0;k<word.size();k++) {
	       	 if(word.get(k).equals(updating)) {
	     
	       		System.out.println("The meaning of the word has been successfully changed. Don't forget to save the file.");
	       		 
	  meaning.set(k, chancing);
	  
		
	}
	
	  }
	}
	 
	 
	
	
	public static void list(){
	        for (int i = 0; i < lesson.size(); i++){
	            System.out.println("Lesson: " + lesson.get(i));             //this codes list lessons word and meanings//
	            System.out.println("Word: " + word.get(i));
	            System.out.println("Meaning: " + meaning.get(i));
	            System.out.println();
	        }
	 }
	 
	public static void search(){
		 Scanner sc = new Scanner(System.in);
           String search = null;                                    //this code search what you want //
           
           
           boolean searchings = false;  
          
		  do {
	    	   
		        try {
		        	System.out.print("Enter the Word: ");
		             search =  sc.nextLine();
		            
		        for(int u=0;u<word.size();u++) {
		        	if (word.get(u).equals(search)) {
		        		System.out.println("Lesson:" + lesson.get(u));
		         	    System.out.println("Word:" + word.get(u));
		         	    System.out.println("Meaning:" + meaning.get(u));
		             searchings = true;
		        	
		        	}
		          }
		      
		        if(searchings == false)
	        		 throw new Exception("There is no such word");
		    
		        
		        }
		        catch(Exception w) {
		        	System.out.println(w);
		        	
		        }
		       } while(searchings == false);
		       
              
	
		  }



public static void sort() {
	
	for(int i=0;i<word.size()-1;i++){
	    for(int j=0;j<word.size()-1;j++){
	        if(lesson.get(j).equals(lesson.get(j + 1))){
	            if(word.get(j).compareToIgnoreCase(word.get(j + 1)) > 0){
	    
	        String s1 = lesson.get(j);
	        String s2 = word.get(j);
	        String s3 = meaning.get(j);
	       
	                                                             //this code sorts lessons and word and meaning//
	        lesson.set(j, lesson.get(j+1));
	        word.set(j, word.get(j+1));
	        meaning.set(j,meaning.get(j+1));
	        lesson.set(j+1, s1);
	        word.set(j+1, s2);
	        meaning.set(j+1, s3);
	}
	        }
	        else if(lesson.get(j).compareToIgnoreCase(lesson.get(j+1)) > 0){
	        	String s1 =lesson.get(j);
		        String s2 = word.get(j);
		        String s3 = meaning.get(j);
		       
		        
		        lesson.set(j, lesson.get(j+1));
		        word.set(j, word.get(j+1));
		        meaning.set(j,meaning.get(j+1));
		        lesson.set(j+1, s1);
		        word.set(j+1, s2);
		        meaning.set(j+1, s3);
	    }


	    }
	}
	
}
		
		
	 
	 
	 
}















