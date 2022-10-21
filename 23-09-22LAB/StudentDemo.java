/* Write a Student and create an array of 10 students and display the students whose marks are more than 90%*/
package com.example;
import java.util.*;
public class StudentDemo {
	private int rollno;
	private String name;
	private float marks;
	
	
Student(int rollno,String name,Float marks)
{
	this.rollno=rollno;
	this.name=name;
	this.marks=marks;
	
}
void setRollno(int rollno)
{
	this.rollno=rollno;
}

int getRollno()
{
	return this.rollno;
}

void setName(String name)
{
	this.name= name;
}

String getName()
{
	return this.name;
}

void setMarks(float marks)
{
	this.marks=marks;
}

float getMarks()
{
	return this.marks;
}
	
	public static void main(String args[])
	{
		Student s[] = new Student[10];

		s[0]= new Student(01,"Sanjana", 89);
		s[1]= new Student(02,"Nilanjana",98);
		s[2]= new Student(03,"Swarupa",90);
		s[3]= new Student(04,"Aranyak",88);
		s[4]= new Student(05,"Sumit",78);
		s[5]= new Student(06,"TuhinAdri",91);
		s[6]= new Student(07,"Subhadip",95);
		s[7]= new Student(08,"Swarnob",79);
		s[8]= new Student(09,"Sumit",78);
		s[9]= new Student(10,"Soumik",80);
		
		

		for(int i=0;i<10;i++)
		{
			if((s[i].getMarks())>=90)
			{
				System.out.println("Name:  "+s[i].getName());
			}

		}



	}


}
	
