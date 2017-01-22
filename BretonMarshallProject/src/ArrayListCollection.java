import java.util.*;

public class ArrayListCollection {
       /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
	  private ArrayList<Movie> arrayListColl = new ArrayList<Movie>();

	  // go get objects from Movie objects list


	public void addToArrayList(Movie m) {
		arrayListColl.add(m);

		/*Add element at the given index

	 	arrayListColl.add(0, "Rahul"); */
	}

	public void removeFromArrayList (Movie m) {
		arrayListColl.remove(m);
	}


	public void printConsole()
	{
		for(int i = 0; i < arrayListColl.size(); i++)
		{
			System.out.println(arrayListColl.get(i).getTitle() + ' ' + arrayListColl.get(i).getMainActor() + ' ' + arrayListColl.get(i).getDirector() + ' ' + arrayListColl.get(i).getYear());
		}
	}

	public Iterator<Movie> getLibrary()
	{
        return arrayListColl.iterator();
	}
}


