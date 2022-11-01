/*Create an ArrayList and perform following opeartions
1. Add an product
2. Delete a product.
3.Display all the products 
> Sort on the basis of price
>Sort on the basis of quantity
(Use lambda and for each)*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product {
	
public Product(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

public static void main(String args[]) {
		
		List<Items> Items = new ArrayList<Items>();
		Items.add(new Items(10,"Acquapanna",30));
		Items.add(new Items(20,"Aero",40));
		Items.add(new Items(30,"Alpo",60));
		Items.add(new Items(40,"Blue Bottle Coffee",50));
		Items.add(new Items(15,"Boost",20));
		System.out.println(Items);
		// Delete an element
		Items.remove(0);
		for(int i=0;i<Items.size();i++)  
		{
			System.out.println(Items.get(i));
		}
		Collections.sort(Items,new MySort());
		System.out.println(Items);
		
		Collections.sort(Items,new MySort());//ascending order
		System.out.println(Items);
		
	}


}


class MySort implements Comparator<Items>{


	public int compare1(Items o1, Items o2) {
		return (o1.getPrice()-o2.getPrice());// sort the product basis on price
		
	}

	public int compare(Items o1,Items o2) {
		return(o1.getQuantity()-o2.getQuantity());// sort the product basis on Quantity
		
	}
}