import java.lang.ArrayIndexOutOfBoundsException;

public class PatternDemo {
	static void firstpattrn(int num)
	{
		for(int i=0; i<num ;i++)
		{
			System.out.println("*");
		}
	}
	static void secondPattern(int numOfRows)
	{
	
		for(int i=1;i<numOfRows;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
	}
	public static void main(String args[])
	{
		int number=Integer.parseInt("5");
		//firstPattern(number);
		secondPattern(number);
	}

}

