
// Java program to demonstrate working of Map interface 
import java.util.*; 
import java.util.function.Consumer;
class HashMapDemo 
{ 
   public static void main(String args[]) 
   { 
       Map< String,Integer> hashMap =  
       new HashMap<>(); 
       hashMap.put("Mopping", 2); 
       hashMap.put("Sweeping", 2); 
       hashMap.put("Trash", 1); 
       hashMap.put("Door Knobs", 1); 
       hashMap.put("Laundry", 2);
  
       // Returns Set view      
       Set< Map.Entry< String,Integer> > am = hashMap.entrySet();    
  
       am.stream().map((Map.Entry<String, Integer> pm) -> {
           System.out.print(pm.getKey()+" = ");
           return pm;
       }).forEachOrdered((Map.Entry<String, Integer> pm) -> {
           System.out.println(pm.getValue());
       });
   } 
} 