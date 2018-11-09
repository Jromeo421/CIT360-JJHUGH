import java.util.*;

public class TreeCollection {

   public static void main(String[] args) {     
      
      //Tree Map
      TreeMap<String, Double> treeMap = new TreeMap<>();
      // Put elements to the map
      treeMap.put("Kiana", (2009.50));
      treeMap.put("Pyper", (2009.75));
      treeMap.put("Paizley", (2011.25));
      treeMap.put("Jordyn", (2012.05));
      treeMap.put("Jamie", (1983.35));
      
     // Get a set of the entries
      Set setTree = treeMap.entrySet();
      // Get an iterator
      Iterator i = setTree.iterator();
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + " : $");
         System.out.println(me.getValue());
      }
      System.out.println();
      // Deposit 1000 into Zara's account
      double balance = treeMap.get("Jamie");
      treeMap.put("Jamie", balance + 1000);
      System.out.println("Jamie's new balance is $" +
              treeMap.get("Jamie") );
   }
}