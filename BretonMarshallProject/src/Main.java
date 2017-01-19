import java.util.*;

public class Main {

    public static void main(String[] args) {

        Movie m = new Movie("99F","Jean Dujardin","Franc Beighbeder", "2007");
        Movie m2 = new Movie("Cube","David Hewlet","Vincenzo Natali", "1997");
        Movie m3 = new Movie("Love","Gaspard Noe","Gaspard Noe", "2013");
        Movie m4 = new Movie("Irreversible","Vincent Cassel","Gaspard Noe", "2002");
        Movie m5 = new Movie("Nymphomaniac","Stacy Martin","Lars Von Trier", "1997");

        ArrayListCollection al = new ArrayListCollection();

        al.addToArrayList(m2);
        al.addToArrayList(m);
        al.addToArrayList(m3);
        al.addToArrayList(m4);
        al.addToArrayList(m5);

        al.displayArrayList();

    }
}