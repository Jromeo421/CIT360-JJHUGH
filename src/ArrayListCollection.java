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
    


   public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    System.out.print("Enter integers please ");
    System.out.println("(EOF or non-integer to terminate): ");

    while(scan.hasNextInt()){
         list.add(scan.nextInt());
    }

    Integer [] nums = list.toArray(new Integer[0]);
    for(int i = 0; i < nums.length; i++){
       System.out.println(nums[i]);
    }
  }   
}
