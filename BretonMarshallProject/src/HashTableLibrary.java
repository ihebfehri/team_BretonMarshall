import java.util.*;

public class HashTableLibrary {

		   private Hashtable<String, Movie> ht = new Hashtable<>();
		   
		   public void add(Movie m)
		   {
			   ht.put(m.getTitle(), m);
		   }
		   
		   public void printConsole()
		   {
			    Enumeration<Movie> e = ht.elements();
			    while(e.hasMoreElements())
			    {
			      Movie m =e.nextElement();
			      System.out.println(m.getTitle() + ". Main actor : " + m.getMainActor() + ". Director : " + m.getDirector() + ". Year : " + m.getYear());
			    }
		   }

	public Iterator<Movie> getLibrary()
	{
		Collection<Movie> content= ht.values();
		return content.iterator();
	}
}
