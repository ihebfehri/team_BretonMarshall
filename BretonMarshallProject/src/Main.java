
public class Main {

	  public static void main(String[] args)
	  {
		  FilmLibrary library = new FilmLibrary();
		  
		  Movie django = new Movie("Django Unchained", "Jamie Foxx", "Tarantino", "2013");
		  Movie strange = new Movie("Dr Strange", "Benedict Cumberbatch", "Scott Derrickson", "2016");
		  Movie moana = new Movie("Moana", "Auli'i Cravalho", "John Musker", "2016");
		  Movie leonidas = new Movie("300", "Gerard Butler", "Zack Snyder", "2006");
		  Movie nowyousee = new Movie("Nox You See Me", "Jesse Eisenberg", "Louis Leterrier", "2013");
		  
		  library.add(django);
		  library.add(strange);
		  library.add(moana);
		  library.add(leonidas);
		  library.add(nowyousee);
		  
		  library.print();
	  }
}
