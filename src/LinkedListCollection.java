import java.util.*;

public class LinkedListCollection {

        //The main class that allows the program to run.
	public static void main(String[] args) {
		
		System.out.println( "\nI love my kids so very much" ); 
		
                
		List children = new LinkedList<>();

                    children.add("\nKiana Marie");
                    children.add("\nPyper Lynn");
                    children.add(0, "\nPaizley Jane");
                    children.add(3, "\nJordyn Elsie");

	      System.out.println("\nMy kids names are ");
	      System.out.println(children);     
					
	}

}