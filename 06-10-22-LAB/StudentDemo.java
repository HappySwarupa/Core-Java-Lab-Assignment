/*Create a Class student which is inherited by 
 * college and school student . Override the method calculate average marks.	*/	
 
		
package com.example;
import java.util.*;
public class StudentDemo {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Student Details");
		int datastrcuture= sc.nextInt();
		int artificalintelegence= sc.nextInt();
		int dbms= sc.nextInt();
		int networking= sc.nextInt();
		int java= sc.nextInt();
		int avg=(datastrcuture+artificalintelegence+dbms+networking+java/5);
		
		System.out.println("The Marks of DataStrcuture:"+datastrcuture);
		System.out.println("The Marks of ArtificalIntelegence:"+artificalintelegence);
		System.out.println("The Marks of  DBMS:"+dbms);
		System.out.println("The Marks of Networking:"+networking);
		System.out.println("The Marks of Java:"+java);
		System.out.println(avg);
		
		
		
		
		
	}

}
