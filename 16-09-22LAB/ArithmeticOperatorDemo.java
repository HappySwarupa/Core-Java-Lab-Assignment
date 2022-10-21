import java.util.*;

public class LogicalOperatorDemo {
	
	public static void main(String args[])
	{
	
		
		Scanner sc= new Scanner(System.in);
		String X= sc.next();
		String Y= sc.next();
		System.out.println("Enter the UserName");
		String UN= sc.next();
		System.out.println("Enter the PassWord");
		String PW= sc.next();
		
		if((UN.equals(X))&&(PW.equals(Y))
		||(UN.equals(Y))&&(PW.equals(X)))
		{
		     System.out.println("Welcome to the Anudip Foundation");
		}
		else
		{
			System.out.println("User Invalid");
		}
	}

}
		
		
		
		

