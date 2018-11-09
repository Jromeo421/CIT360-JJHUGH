import java.util.*;

public class LinkedListCollection {

        @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		System.out.println( "\nI love my kids so very much" ); 
		
		List children = new LinkedList<>();

children.add("Networking");
children.add("and Server Administration");
children.add(0, "Cyber Security");

	      System.out.println("My Name is Jonathan and I like: ");
	      System.out.println(children);     
					
	}

}