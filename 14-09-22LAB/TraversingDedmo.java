import java.util.*;
public class TraversingDedmo {
	
	
	
	static void traverseArray(String args[]) {
		int myArray[]= {1,2,3,4,5,6,7};
		System.out.println("Elements of array are:");
		for(int i=0;i<myArray.length;i++)
		{
			System.out.println(myArray[i]);
		}
		
		
	}
	static void inputArray(int num)
	{ 
		int j=2;
		
		int newArray[]= new int[num];
		for(int i=0;i<num;i++)
		{
			newArray[i]= j;
			j=j+2;
		}
		for(int i=0;i<num;i++)
		{
			System.out.println(newArray[i]);
		}
	}
   public static void main(String args[])
   {
	   Scanner sc= new Scanner(System.in);
	  System.out.println("enter the size of the array:");
	  int size= sc.nextInt();
	  inputArray(size);
   }
}
