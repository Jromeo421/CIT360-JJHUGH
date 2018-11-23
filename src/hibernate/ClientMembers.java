/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.Scanner;

/**
 *
 * @author JRome
 */
public class ClientMembers {
    
    /**Declare the object and initialize with
     * predefined standard input objects.
     * @param args
     */
       
    public static void main(String[] args){
        
    //Declare the object and initialize with predefined standard input object.
    Scanner newClient = new Scanner(System.in);
    
    // String input for the full name.
    System.out.print("What is your full name?");
    String full_name = newClient.nextLine();
    
    //String Input for the type of service
    System.out.print("What service do you need?");
    String service = newClient.nextLine();
    
    //String input for the time
    System.out.print("what time do you what?");
    String appointment = newClient.nextLine();
    
    System.out.print("What is your phone number?");
    long phone = newClient.nextLong();
    
    System.out.println("Name: " + full_name);
    System.out.println("Service needed: " + service);
    System.out.println("appointment time: " + appointment);
    System.out.println("Phone Number " + phone);
    }

}
