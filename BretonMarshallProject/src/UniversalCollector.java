import java.util.ArrayList;
import java.util.Iterator;

public class UniversalCollector {


    private ArrayList<Movie> al = new ArrayList<>();

    public void printConsole()
    {
        for(int i = 0; i < al.size(); i++)
        {
            System.out.println(al.get(i).getTitle() + ". Main Actor : " + al.get(i).getMainActor() + ". Director : " + al.get(i).getDirector() + ". Year : " + al.get(i).getYear());
        }
    }

    public void addLbrary(Iterator<Movie> it)
    {
        while (it.hasNext()) {
            al.add(it.next());
        }
    }
}
