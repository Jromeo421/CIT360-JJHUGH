class MultiRunnable implements Runnable{  
@Override
public void run(){  
System.out.println("thread is running... feel free to check the code.");  
}  
  
public static void main(String args[]){  
MultiRunnable m1 = new MultiRunnable();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}  