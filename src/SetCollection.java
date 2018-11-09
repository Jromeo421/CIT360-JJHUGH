import java.util.*;
public class SetCollection {

	public static void main(String[] args) {
                
                System.out.println("Current Chore List:");
		String[] chores ={"\nMopping the Floor","\nSweeping the floor","\nCleaning the table"};
		List<String> tasks = new ArrayList<>();
		
		//add array items to list
		
		for(String c: chores) {
                    tasks.add(c);
                    

                }

                   //Display the list in the output.
                for(int i =0;i<tasks.size();i++){
                        System.out.printf("%s ", tasks.get(i));

                //	for(int i =0;i<List2.size();i++){
                //	System.out.printf("%s ", List2.get(i)); 

                }
	}
}