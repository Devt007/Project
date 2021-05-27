import java.util.Scanner;

class Movie {
	private int rating;
	private String name, director;
	private float price;

	// Subtask 1: Write the code here to create a parameterized constructor
	// accepting parameters rating, name, director and price
	public Movie(int rating, String name, String director, float price) {
		this.rating=rating;
		this.name=name;
		this.director=director;
		this.price=price;

	}

	// Subtask 2: Write the code here to create public getter methods for all
	// the private data members
	public int getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public String getDirector() {
		return director;
	}

	public float getPrice() {
		return price;
	}

}

public class MovieApp {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//2

		// Subtask 3: Write the code here to create array of Movie objects of
		// size n
		Movie movie[]= new Movie[n];

		for (int i = 0; i < n; i++) {
			
			int movieRating = scan.nextInt();
			String movieName = scan.next();
			String movieDirector = scan.next();
			float moviePrice = scan.nextFloat();
			movie[i]=new Movie(movieRating, movieName, movieDirector, moviePrice);
            // Subtask 4: Write the code here for initializing Movie objects
			// using constructor passing rt, mname, mdirector and mprice as
			// values
		}

		int x = scan.nextInt();
		// Subtask 5: Write the code here to reduce the price to 80% of the
		// price for the movies that have a rating greater than or equal to x
	for(int i=0;i<n;i++)
	{
		if(movie[i].getRating()>=x)
		{
			float price=movie[i].getPrice() - (movie[i].getPrice() * 0.20f);
			System.out.println(movie[i].getRating()+" "+movie[i].getName()+" "+movie[i].getDirector()+" "+price);
		}
		else
		System.out.println(movie[i].getRating()+" "+movie[i].getName()+" "+movie[i].getDirector()+" "+movie[i].getPrice());

	}
		
	}
}