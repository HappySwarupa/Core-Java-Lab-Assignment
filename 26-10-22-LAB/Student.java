/*Create  a HashMap to store the fees submitted by student .The key of the Map will be Student Id.
Create a method to find a student using the ID."*/
package com.Arraylist;
import java.util.*;
import java.util.HashMap;
public class Student {
	public static void main(String args[]) {
		HashMap<Integer,String>student=new HashMap<Integer,String>();
		student.put(224, "49000");
		student.put(225, "51000");
		student.put(125, "80000");
		student.put(126, "81000");
		student.put(234, "75000");
		student.put(236, "81000");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID=");
		int ID= sc.nextInt();
		if(student.containsKey(ID)) {
			System.out.println(ID+"ID="+student.get(ID));
		}
		
		
		
	}