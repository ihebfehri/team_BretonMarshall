public class Main {

	  public static void main(String[] args)
	  {
		  HashSetLibrary hs = new HashSetLibrary();
          ArrayListCollection al = new ArrayListCollection();
		  UniversalCollector uc = new UniversalCollector();
		  HashTableLibrary ht = new HashTableLibrary();

		  //creating al collection
          Movie m = new Movie("99F","Jean Dujardin","Franc Beighbeder", "2007");
          Movie m2 = new Movie("Cube","David Hewlet","Vincenzo Natali", "1997");
          Movie m3 = new Movie("Love","Gaspard Noe","Gaspard Noe", "2013");
          Movie m4 = new Movie("Irreversible","Vincent Cassel","Gaspard Noe", "2002");
          Movie m5 = new Movie("Nymphomaniac","Stacy Martin","Lars Von Trier", "1997");

          al.addToArrayList(m2);
          al.addToArrayList(m);
          al.addToArrayList(m3);
          al.addToArrayList(m4);
          al.addToArrayList(m5);

          //creation hs library
		  Movie django = new Movie("Django Unchained", "Jamie Foxx", "Tarantino", "2013");
		  Movie strange = new Movie("Dr Strange", "Benedict Cumberbatch", "Scott Derrickson", "2016");
		  Movie moana = new Movie("Moana", "Auli'i Cravalho", "John Musker", "2016");
		  Movie leonidas = new Movie("300", "Gerard Butler", "Zack Snyder", "2006");
		  Movie nowyousee = new Movie("Nox You See Me", "Jesse Eisenberg", "Louis Leterrier", "2013");

          hs.add(django);
          hs.add(strange);
          hs.add(moana);
          hs.add(leonidas);
          hs.add(nowyousee);

          //creating ht library
          Movie lotr = new Movie("The Lord of the Rings", "Elijah Wood", "Peter Jackson", "2001");
          Movie sw = new Movie("Star Wars", "Mark Hamil", "Georges Lucas", "1977");
          Movie archi = new Movie("Software Architecture Tale", "Breton", "Marshall", "2017");
          Movie  wil = new Movie("What is love", "Baby don't hurt me", "don't hurt me", "no more");
          Movie  thegame = new Movie("You lost the game", "Iheb Fehri", "Damien Frugier", "2017");
          Movie  transformers = new Movie("Transformers", "Shia LaBoeuf", "Micheal Bay", "2009");
          Movie forty = new Movie("42", "Brandon Lopes", "Hugo Kisebwe", "2016");

          ht.add(lotr);
          ht.add(sw);
          ht.add(archi);
          ht.add(wil);
          ht.add(thegame);
          ht.add(transformers);
          ht.add(forty);

          // puting these libraries into the universalCollector
          uc.addLbrary(al.getLibrary());
          uc.addLbrary(hs.getLibrary());
          uc.addLbrary(ht.getLibrary());

          //printing libraries

          System.out.println("===== Printing the content of the ArrayList =====\n");
          al.printConsole();
          System.out.println("\n \n ===== Printing the content of the HashSet =====\n");
          hs.printConsole();
          System.out.println("\n \n===== Printing the content of the HashTable =====\n");
          ht.printConsole();
          System.out.println("\n \n===== Printing the content of the UniversalCollector =====\n");
		  uc.printConsole();
	  }
}
