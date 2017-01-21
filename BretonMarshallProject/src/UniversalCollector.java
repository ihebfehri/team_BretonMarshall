import java.util.ArrayList;
import java.util.Iterator;

public class UniversalCollector {


    private ArrayList<Movie> arrayListColl = new ArrayList<Movie>();

    public void print()
    {
        for(int i = 0; i < arrayListColl.size(); i++)
        {
            System.out.println(arrayListColl.get(i).getTitle() + ' ' + arrayListColl.get(i).getMainActor() + ' ' + arrayListColl.get(i).getDirector() + ' ' + arrayListColl.get(i).getYear());
        }
    }

}
