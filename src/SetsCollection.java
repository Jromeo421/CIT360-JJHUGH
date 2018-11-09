import java.util.*;

public class SetsCollection {

  public static void main(String args[]) { 
     int count[] = {5,10,15,20,25,30};
     Set<Integer> set = new HashSet<>();
     try{
        for(int i = 0; i < 10; i++){
           set.add(count[i]);
        }
        System.out.println(set);
  
        TreeSet<Integer> sortedSet = new TreeSet<>(set);
        System.out.println("The sorted List is " + sortedSet);
      

        System.out.println("The first number is "+ sortedSet.first());
        
        
        System.out.println("The last number is "+ sortedSet.last());
     }
     catch(Exception e){}
  }
} 