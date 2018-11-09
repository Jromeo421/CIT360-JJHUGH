import java.util.*; 

class SetsCollection { 
    
    public static void main(String[] args) 
    { 
  
        // Create a HashSet 
        HashSet<String> Chores = new HashSet<>(); 
  
        // add elements to HashSet 
        Chores.add("Mopping"); 
        Chores.add("Sweeping"); 
        Chores.add("Wiping"); 
        Chores.add("Dusting"); 
        Chores.add("Wiping");
        Chores.add("Taking out Trash");
  
        // Duplicate removed 
        Chores.remove("wiping"); 
  
        // Displaying HashSet elements 
        System.out.println("Chores Set"); 
        Chores.forEach((explain) -> {
            System.out.println(explain);
        }); 
    } 
} 