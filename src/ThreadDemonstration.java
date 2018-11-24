// Java code for thread creation by extending 
// the Thread class 
class ThreadingDemonstration extends Thread 
{ 
    @Override
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("There are " + 
                  Thread.currentThread().getId() + 
                  " running threads"); 
  
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 
  
// Main Class 
public class ThreadDemonstration
{ 
    public static void main(String[] args) 
    { 
        int n = 10; // Number of threads 
        for (int i=3; i<10; i++) 
        { 
           ThreadingDemonstration object = new ThreadingDemonstration(); 
            object.start(); 
        } 
    } 
}