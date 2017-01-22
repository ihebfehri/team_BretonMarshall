import java.util.*;

public class HashTableLibrary {

		   private Hashtable<String, Movie> ht = new Hashtable<String, Movie>();
		   
		   public void addMovie(Movie m)
		   {
			   ht.put(m.getTitle(), m);
		   }
		   
		   public void printConsole()
		   {
			    Enumeration<Movie> e = ht.elements();
			    while(e.hasMoreElements())
			    {
			      Movie m =e.nextElement();
			      System.out.println(m.getTitle() + " " + m.getMainActor() + " " + m.getDirector() + " " + m.getYear());
			    }
		   }

	public Iterator<Movie> getLibrary()
	{
		Collection<Movie> content= ht.values();
		return content.iterator();
	}
}
