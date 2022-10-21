import java.util.*;

public class TwoDimentionalArray2 {
	
	public static void main(String args[])
	{
		 int[][] a ={ //0   1   2   3
                        {1, 2, 3}, 
                       {4, 5, 6, 9}, 
                       {7}, 
                    };
		 System.out.println("Result of Multgiplication"+ (a[0][1]*a[1][2]));
		 System.out.println("Result of Addition"+ (a[0][1]+a[2][0]));
		 System.out.println("Result of Subtraction"+ (a[1][3]-a[0][2]));
	}

}
