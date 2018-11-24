class MultiRunnable implements Runnable{  
@Override
public void run(){  
System.out.println("thread is running... feel free to check the code.");  
}  
  
public static void main(String args[]){  
MultiRunnable r1 = new MultiRunnable();  
Thread z1 =new Thread(r1);  
z1.start();  
 }  
}  