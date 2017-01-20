import java.util.Enumeration;
import java.util.Hashtable;

public class FilmLibrary {

		   private Hashtable<String, Movie> ht = new Hashtable<String, Movie>();
		   
		   public void addMovie(Movie m)
		   {
			   ht.put(m.getTitle(), m);
		   }
		   
		   public void print()
		   {
			    Enumeration<Movie> e = ht.elements();
			    while(e.hasMoreElements())
			    {
			      Movie m =e.nextElement();
			      System.out.println(m.getTitle() + " " + m.getMainActor() + " " + m.getDirector() + " " + m.getYear());
			    }
		   }
}
