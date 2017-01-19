import java.util.*;

public class arrayListCollection {

    public static void main(String[] args) { 
       /*Creation of ArrayList: I'm going to add String
       *elements so I made it of string type */
	  ArrayList<String> arrayListColl = new ArrayList<String>();

	  // go get objects from Movie objects list


	  /*This is how elements should be added to the array list*/
	  arrayListColl.add("Ajeet");


	  /* Displaying array list elements */
	  System.out.println("Currently the array list has following elements:"+arrayListColl);

	  /*Add element at the given index*/
	  arrayListColl.add(0, "Rahul");
	  arrayListColl.add(1, "Justin");

	  /*Remove elements from array list like this*/
	  arrayListColl.remove("Chaitanya");
	  arrayListColl.remove("Harry");

	  System.out.println("Current array list is:"+arrayListColl);

	  /*Remove element from the given index*/
	  arrayListColl.remove(1);

	  System.out.println("Current array list is:"+arrayListColl);


    }

}
