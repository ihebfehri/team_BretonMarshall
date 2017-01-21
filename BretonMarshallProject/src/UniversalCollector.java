import java.util.ArrayList;
import java.util.Iterator;

public class UniversalCollector {


    private ArrayList<Movie> al = new ArrayList<Movie>();

    public void print()
    {
        for(int i = 0; i < al.size(); i++)
        {
            System.out.println(al.get(i).getTitle() + ' ' + al.get(i).getMainActor() + ' ' + al.get(i).getDirector() + ' ' + al.get(i).getYear());
        }
    }

    public void addLbrary(Iterator<Movie> it)
    {
        while (it.hasNext()) {
            al.add(it.next());
        }
    }

}
