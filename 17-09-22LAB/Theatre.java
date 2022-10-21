import java.util.*;
class Theatre {
	
	private String movieName;
	private String movieTime;
	private double ticketprice;
	
	void insertMovie( String movieName, String movieTime, double ticketprice) {
	this.movieName=movieName;
	this.movieTime=movieTime;
	this.ticketprice=ticketprice;
		
	}
	void displayMovie()
	{
		System.out.println("movie name:"+this.movieName+"  "+"Time:"+this.movieTime+"  "+"ticketprice:"+this.ticketprice+"  ");
	}
 
}
public class MovieInput
{
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		String mName,mTime;
		Theatre movie1= new Theatre();
		movie1.insertMovie("3idiots","7pm.8pm",250);
		Theatre movie2= new Theatre();
		movie2.insertMovie("twilight","6pm.9pm",250);
		Theatre movie3= new Theatre();
		movie3.insertMovie("The pianist","5pm.7pm",250);
		
		System.out.println();
		System.out.println("--------enter the movie details----------");

		movie1.displayMovie();
		movie2.displayMovie();
		movie3.displayMovie();
	}
}	