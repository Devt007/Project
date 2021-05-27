
public class Movie {

	private int movieId,yearOfRelease,ratings;
	private String nameOfTheMovie;
	private String[] casting;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movieId, String nameOfTheMovie, String[] casting, int yearOfRelease, int ratings) {
		super();
		this.movieId = movieId;
		this.yearOfRelease = yearOfRelease;
		this.ratings = ratings;
		this.nameOfTheMovie = nameOfTheMovie;
		this.casting = casting;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public String getNameOfTheMovie() {
		return nameOfTheMovie;
	}
	public void setNameOfTheMovie(String nameOfTheMovie) {
		this.nameOfTheMovie = nameOfTheMovie;
	}
	public String[] getCasting() {
		return casting;
	}
	public void setCasting(String[] casting) {
		this.casting = casting;
	}
	
	
	
}
