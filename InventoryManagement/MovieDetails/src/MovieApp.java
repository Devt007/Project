import java.util.Scanner;

/*

1. Create a Movie class which accepts:
          Id,Name Casting, YearOfRelease, and the ratings varying from 0 to 5.
          
2. Add Movie details to the system and display all Movie details present in system.
          Ask the user to enter the details and display.
          
3. Sort Movie details by Year of Release and if the year is same sort by its Name 

3. Display all the movie details whose Rating is greater than or equal to given value a.

4. Display all movie details for the given Casting(it should match the input in array of String)a.  
 
5. Update Rating details for given Movie Id 
		Step 1:Get the Movie Id and Rating to be updated as an user input
		Step 2: Fetch the movie details for a given id and if present, update the rating details with new value
		Step 3: Display the details

*/
public class MovieApp {
	static Scanner sc = new Scanner(System.in);
	static int size;
	static boolean flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie[] = null;
		flag=true;
		do {
			options();
			byte option = sc.nextByte();
			switch (option) {
			case 1: {
				System.out.println("Enter the number of inventory to be added ");
				size = sc.nextInt();
				movie = addDetails(size);
				break;
			}
			case 2://case 2
			{
				movieSort(movie);
				break;
			}
			case 3://case 3
			{
				displayRatings(movie);
				break;
			}
			
			case 4://case 4
			{
				displayCastDetails(movie);
				break;
			}
			case 5:
			{
				updateRating(movie);
			}
		 case 6:
		 {
			 deleteMovies(movie);
		 }
		 case 7:
		 {
			 flag=false;
				break;
		 }
		}	  
	} while (flag);


	}

	private static void displayCastDetails(Movie[] movie) {
		// TODO Auto-generated method stub 
		Movie[] castDetails=movie;
		System.out.println("Enter the name of the cast to display all his movies");
		String s=sc.next();
		for(int i=0;i<movie.length;i++)
		{
			String cast[]=castDetails[i].getCasting();
			for(int j=0;j < movie[i].getCasting().length-1;j++)
			{
			if(cast[j].equals(s)==true)
			{
				displayCast(castDetails[i]);
			}
			//1--a,b,c
			//2--a,e,f
			//3--j,k,l,
			//4--a,j,h
			//5--m,j,s
		  }
		}
		
	}

	private static void displayCast(Movie movie) {
		// TODO Auto-generated method stub
		System.out.println(movie.getMovieId()+" "+movie.getNameOfTheMovie());
	}

	private static void options() {
		// TODO Auto-generated method stub
		System.out.println("----------------------Movie Details------------------------");
		System.out.println();
		System.out.println("Please Enter the following options");
		System.out.println("Enter 1) To add Movie details");
		System.out.println("Enter 2) Sort the Movie details by Year");
		System.out.println("Enter 3) Display all the movie details whose ratingis greater than or equal to given value.");
		System.out.println("Enter 4) Display the name of the Cast to display adetails accordingly");
		System.out.println("Enter 5) Update the movie details based on Ratings");
		System.out.println("Enter 6) Delete the movie details based on MovieId");
		System.out.println("Enter 6) Exit");
	}

	private static void deleteMovies(Movie[] delete) {
		// TODO Auto-generated method stub
		System.out.println("enter how many data to delete");
		Movie[] delete2=new Movie[delete.length-1];
		System.out.println("Enter the Movieid of to be deleted");
		int Movieid=sc.nextInt();
		sc.nextLine();
		for (int i = 0, k = 0; i < delete.length; i++) { 
			if (delete[i].getMovieId() == Movieid) { 
				continue; 
			}                                   
			
			delete2[k++] = delete[i]; 
		} 


		displaySortedArray(delete2);
}

	
	private static void movieSort(Movie[] sortMovie) {
		// TODO Auto-generated method stub
		Movie manage[]=sortMovie;
		System.out.println("The Products Sorted according to Quantity");
		for(int i=0;i<sortMovie.length;i++)
		{
			for(int j=i+1;j<sortMovie.length;j++)
			{
				if(manage[i].getYearOfRelease() > manage[j].getYearOfRelease())
				{
					Movie smallest=manage[i];
					manage[i]=manage[j];
					manage[j]=smallest;
				}
				if(manage[i].getYearOfRelease() == manage[j].getYearOfRelease())
				{
					if(manage[i].getNameOfTheMovie().compareTo(manage[j].getNameOfTheMovie())>0)
					{
						Movie smallest=manage[i];
						manage[i]=manage[j];
						manage[j]=smallest;
					}
				}

				
			}
		}
		displaySortedArray(manage);
	}

	private static void displaySortedArray(Movie[] manage) {
		// TODO Auto-generated method stub
		Movie displayMovie[]=manage;
		for(int i=0;i<manage.length;i++)
		{
			System.out.println("Movie ID = "+displayMovie[i].getMovieId()+" Movie name = "+displayMovie[i]. getNameOfTheMovie()+
                      " Ratings "+displayMovie[i].getRatings()+" YearOfRelease "+displayMovie[i].getYearOfRelease());
			String arr[]=displayMovie[i].getCasting();
			for(int j=0;j < displayMovie[i].getCasting().length;j++)
			{
				System.out.println(arr[j]+" ");
			}
		}
	}

	private static void displayRatings(Movie[] displayMovie) {
		System.out.println("Enter the Rating to display the details greater than or equal to the rating given by you ");
		int rating=sc.nextInt();
		for(int i=0;i<displayMovie.length;i++)
		{
			if(displayMovie[i].getRatings()>=rating)
			{
				System.out.println("Movie ID = "+displayMovie[i].getMovieId()+" Movie name = "+displayMovie[i]. getNameOfTheMovie()+" Movie Cast = "+displayMovie[i].getCasting()+" Ratings "+displayMovie[i].getRatings());
			}
		}
		
	}

	private static void updateRating(Movie[] ratingUpdate) {
		// TODO Auto-generated method stub
		System.out.println("Enter how many movies's ratings do you want to change");
		int num = sc.nextInt();
		for (int j = 0; j < num; j++) {
			System.out.println("Enter the product id for which the quantity has to be updated");
			int rating = sc.nextInt();
			System.out.println("Enter the Year OF Release");
			int year = sc.nextInt();
		for (int i = 0; i < ratingUpdate.length; i++) {
			
			if ((Integer.compare(ratingUpdate[i].getRatings(), rating)) == 0) {
				ratingUpdate[i].setYearOfRelease(year);		
				}
		}
		}
		System.out.println("Successfully Updated");	
		displaySortedArray(ratingUpdate);
	}

	private static Movie[] addDetails(int size) {
		// TODO Auto-generated method stub
		Movie creation[] = new Movie[size];
			for (int i = 0; i < size; i++) {
				System.out.println("Enter thet MovieID");
				int movieId=sc.nextInt();
				System.out.println("Enter the name");
				String nameOfTheMovie = sc.next();
				System.out.println("Enter the number of casts in the Movie");
				int cast=sc.nextInt();
				String[] casting= castNames(cast);
				System.out.println("Enter the year of release");
				int yearOfRelease = sc.nextInt();
				System.out.println("Enter the Rating of the movie from 1 to 5");
				int ratings= ratings();
				System.out.println("-----------------");
				creation[i] = new Movie(movieId, nameOfTheMovie, casting, yearOfRelease, ratings);
			}
		
		return creation;
	}

	private static int ratings() {
		// TODO Auto-generated method stub
		while (true) {
			int ratings2 = sc.nextInt();
			if (ratings2 > 0 && ratings2 <= 5) {
				flag=false;
				return ratings2;
				
			}

			else
				System.out.println("Enter the Correct Ratings");

		}

	}

	private static String[] castNames(int cast) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Cast Names : ");
		String[] movieCast=new String[cast];
		for(int i=0;i<cast;i++)
		{
			movieCast[i]=sc.next();
			sc.nextLine();
			
		}
		return movieCast;
	}


	
}

	
	