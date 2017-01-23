import java.util.HashSet;
import java.util.Iterator;

public class HashSetLibrary {
    private HashSet<Movie> hs = new HashSet<>();

    public void add(Movie movie) {
        hs.add(movie);
    }

    public void printConsole() {
        Iterator<Movie> it = hs.iterator();
        Movie movie;
        while (it.hasNext()) {
            movie = it.next();
            System.out.println(movie.getTitle() + ". Main Actor : " + movie.getMainActor() + ". Director : " + movie.getDirector() + ". Year : " + movie.getYear());
        }
    }

    public Iterator<Movie> getLibrary()
    {
        return hs.iterator();
    }
}
