import java.util.*;

public class SetsCollection {

  public static void main(String args[]) { 
     int count[] = {5,10,15,20,25,30};
     Set<Integer> setList = new HashSet<>();
     try{
        for(int i = 0; i<5; i++){
           setList.add(count[i]);
        }
        System.out.println(setList);
  
        TreeSet<Integer> sortedSet = new TreeSet<>();
        System.out.println("The sorted List is " + sortedSet);
      

        System.out.println("The first number is "+ sortedSet.first());
        
        
        System.out.println("The last number is "+ sortedSet.last());
     }
     catch(Exception e){}
  }
} 