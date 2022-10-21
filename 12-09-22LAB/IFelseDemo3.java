import java.util.*;
public class IFelseDemo3 {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int examscore= sc.nextInt();
		int num=0;
		char grade;
		
		if(examscore>=80 && examscore<=100)
		{
			grade= 'A';
			
		}
		else if(examscore>=60 && examscore<=80)
		{
			grade= 'B';
		}
		
		else if(examscore>=50 && examscore<=60)
		{
			grade= 'C';
		}
		else if(examscore>=45 && examscore<=50)
		{
			grade= 'D';
		}
		else if(examscore>=25 && examscore<=45)
		{
			grade= 'E';
		}
		else
		{
			grade= 'F';
		}
	
		
		System.out.println("grade is"+ grade);	
	}


}


