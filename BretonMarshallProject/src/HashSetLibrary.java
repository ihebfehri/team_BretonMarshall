import java.util.HashSet;
import java.util.Iterator;

public class HashSetLibrary {
    private HashSet<Movie> hs = new HashSet<Movie>();

    public void add(Movie movie) {
        hs.add(movie);
    }

    public void print() {
        Iterator<Movie> it = hs.iterator();
        Movie movie;
        while (it.hasNext()) {
            movie = it.next();
            System.out.println(movie.getTitle() + ' ' + movie.getMainActor() + ' ' + movie.getDirector() + ' ' + movie.getYear());
        }
    }
}
