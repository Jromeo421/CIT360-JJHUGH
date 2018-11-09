import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JJ Hugh
 */
public class ArrayListCollection {
    


   private static Scanner j = new Scanner (System.in);
   private static int[] intData = new int[8];
   
   public static void main(String[] args){
       System.out.println("Please enter 8 integers of your choice. ");
       getInput();
       outputArray(intData);
       sizeArray();
       System.out.println("Please Enter 10 integers of your choice. ");
       getInput();
       outputArray(intData);
    }
   
   private static void getInput(){
       for(int i = 0; i < intData.length; i++)
           intData[i] = j.nextInt();
  }   
   
    private static void outputArray(int[] arr){
       for(int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
    }
    
     private static void sizeArray(){
       int[] first = intData;
       
       intData = new int[10];
       for (int i = 0; i < first.length; i++) {
           intData[i] = first[i];
       }
}
}
