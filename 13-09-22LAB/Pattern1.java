import java.util.*;
public class Pattern2 {
	public static void main(String args[])
	{
		int rows=6;
		
    for (int i= rows-1; i>=0 ; i--)
		{
			for (int j=0; j<=i; j++)
			{
			System.out.print("*");
			}
		
		System.out.println();
		}
	}

}
