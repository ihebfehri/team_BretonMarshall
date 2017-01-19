public class Movie {

	private String title;
	private String mainActor;
	private String director;
	private String year;
	
	public Movie(String title, String mainActor, String director, String year)
	{
		this.title = title;
		this.mainActor = mainActor;
		this.director = director;
		this.year = year;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getMainActor()
	{
		return this.mainActor;
	}
	
	public String getDirector()
	{
		return this.director;
	}
	
	public String getYear()
	{
		return this.year;
	}
}

