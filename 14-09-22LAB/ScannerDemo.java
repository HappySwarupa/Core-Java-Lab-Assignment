import java.util.*;
public class ScannerDemo {
	
	static int rollno;
	static String name;
	static float marks;
	static char gender;
;
	
	static void takeinput(){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your roll number");
		rollno= sc.nextInt();
		System.out.println("enter your name");
		name= sc.next();
		System.out.println("enter your marks");
		marks= sc.nextFloat();
		System.out.println("enter your gender");
		gender= sc.next().charAt(0);
			
	}
	static void display()
	{
		System.out.println();
		System.out.println();
		System.out.println("--------student details-------");
		System.out.println("enter the rollno"+ rollno);
		System.out.println("enter the name"+ name);
		System.out.println("enter the marks "+ marks);
		System.out.println("enter the gender"+ gender);
	}
	public static void main(String args[])
	{
		takeinput();
		display();
		
	}

}
