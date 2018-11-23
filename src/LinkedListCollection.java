import java.util.*;

public class LinkedListCollection {

        //The main class that allows the program to run.
	public static void main(String[] args) {
		
		System.out.println( "\nI love my kids so very much " ); 
		
                
		List children = new LinkedList<>();

                    children.add("Kiana Marie ");
                    children.add("Pyper Lynn ");
                    children.add(0, "Paizley Jane ");
                    children.add(3, "Jordyn Elsie ");

	      System.out.println("\nMy kids names are ");
	      System.out.println(children);     
					
	}

}