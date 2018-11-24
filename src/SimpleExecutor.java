import java.util.concurrent.*;
 
/**
 * SimpleExecutorExample.java
 * This program demonstrates how to create a single-threaded executor
 * to execute a Runnable task.
 * @author www.codejava.net
 */
public class SimpleExecutor {
 
    public static void main(String[] args) {
        ExecutorService avenger = Executors.newSingleThreadExecutor();
 
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName());
        };
 
        avenger.execute(task);
 
        avenger.shutdown();
    }
}