package com.inherit;
import java.util.*;
class HourlyEmployee {
	void HourlyEmployeeDetails() {
	
	int ID=224;
	String Name="Swarupa Dey";
	int TimePeriod= 5;
	}

}
class SalariedEmployee extends HourlyEmployee{
	void SalariedEmployee() {
	
	int ID=225;
	String Name="Rajashree Adhikary";
    int Salary=50000;
	}
	
}
 public class Test extends SalariedEmployee {
	 public static void main(String args[])
	 {
		 SalariedEmployee s1= new SalariedEmployee();
		 System.out.println("-----Enter the Employee Details----");
		 s1.SalariedEmployee();
		 s1.HourlyEmployeeDetails();
		 
	 }
 }