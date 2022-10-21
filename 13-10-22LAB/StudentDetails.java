package com.demo;
import java.util.*;
	class MyException extends Exception {
	}
	 
	// A Class that uses above MyException
	public class StudentDetails{
	    // Driver Program
	    public static void main(String args[])
	    {
	    	Scanner sc= new Scanner(System.in);
	    	String Name=sc.next();
	    	String id=sc.next();
	    	id=null;
	         try
	         {
	             if (id.equals(null)||Name.equals(null)) {
	            	
	                 System.out.print("Name can not be null");
	             }
	             else {
	                 System.out.print("null");    
	             }
	         }
	         catch(NullPointerException e)
	         {
	             System.out.print("Caught NullPointerException");
	         }
	     }
	 }