import java.util.*;

public class SetsCollection {

  public static void main(String args[]) { 
     int count[] = {5,10,15,20,25,30};
     Set<Integer> setList = new HashSet<Integer>();
     try{
        for(int i = 0; i < 10; i++){
           setList.add(count[i]);
        }
        System.out.println(setList);
  
        TreeSet<Integer> sortedSet = new TreeSet<Integer>(setList);
        System.out.println("The sorted List is " + sortedSet);
      

        System.out.println("The first number is "+ sortedSet.first());
        
        
        System.out.println("The last number is "+ sortedSet.last());
     }
     catch(Exception e){}
  }
} 