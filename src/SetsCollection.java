import java.util.*; 

class SetsCollection { 
    
    public static void main(String[] args) 
    { 
  
        // Create a HashSet 
        HashSet<String> Chores = new HashSet<>(); 
  
        // add elements to HashSet 
        Chores.add("\nMopping"); 
        Chores.add("\nSweeping"); 
        Chores.add("\nWiping"); 
        Chores.add("\nDusting"); 
        Chores.add("\nWiping");
        Chores.add("\nTaking out Trash");
  
        // Duplicate removed 
        Chores.add("wiping"); 
  
        // Displaying HashSet elements 
        System.out.println("Hash Set has "); 
        Chores.forEach((temp) -> {
            System.out.println(temp);
        }); 
    } 
} 