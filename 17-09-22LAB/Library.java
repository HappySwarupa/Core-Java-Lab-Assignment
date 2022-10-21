import java.util.*;
class Library {
	
	private String bookName;
	private String bookAuthorName;
	private int bookprice;
	
	void insertMovie( String BookName, String BookAuthor, int Bookprice) {
		this.bookName=BookName;
		this.bookAuthorName=BookAuthor;
		this.bookprice=Bookprice;		
	}
	
	void displaybook()
	{
		System.out.println("book Name:"+this.bookName+"  "+"book Author Name:"+this.bookAuthorName+"  "+"Book price:"+this.bookprice+"  ");
	}
 
}
public class LibraryInput
{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		//String bookName,bookAuthorName;
		Library bookName= new Library();
		bookName.insertMovie("MockingBird","Erskine novel",250);
		
		System.out.println();
		System.out.println("--------enter the Library details----------");

		
		bookName.displaybook();
	}
}
