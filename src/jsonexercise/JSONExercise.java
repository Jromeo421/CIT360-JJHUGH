/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonexercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author JJHugh
 */
public class JSONExercise {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings({"unchecked", "unchecked"})
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's Name: ");
        String name = input.nextLine();
        
         //create a new JSON object
        JSONObject root = new JSONObject();
        
        //put the name name-value pair
        root.put("name", name);
        
        JSONArray courses = new JSONArray();
        
        while(true){
           
        //getting the course name
        System.out.print("Enter course name: ");
        String course = input.nextLine();
        
        //check to see if user hits Enter
        if (course.length() == 0){
            break;
        }
        //getting the grade
        System.out.print("Enter grade: ");
        int grade = input.nextInt();
        
        if(input.hasNextLine()){
            input.nextLine();
        }
        //create a JSON array and store a class object.
        JSONObject courseObject = new JSONObject();
        courseObject.put("grade ", grade);
        courseObject.put("name ", course);
        
        //adding the course to the array.
        courses.add(courseObject);
        }
        
        //add the array to the root object.
        root.put("courses", courses);
        
        System.out.println(root.toJSONString());
        //creating a file and writing the JSON structure to it.
        File file = new File("StudentGrades.txt");
        
        try (PrintWriter writer = new PrintWriter(file)){
            writer.print(root.toJSONString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        System.out.println("File Created Successfully\n\n Hit Return to display");
        input.nextLine();
        
        try {
            input = new Scanner(file);
            
            StringBuilder jsonIn = new StringBuilder();
            
            while(input.hasNextLine()){
                
                jsonIn.append(input.nextLine());
            }
            System.out.print(jsonIn.toString());
            
            JSONParser parser = new JSONParser();
            
            JSONObject objRoot = (JSONObject) parser.parse(jsonIn.toString());
            System.out.printf("Student name is %s\n", objRoot.get("name").toString());
            JSONArray coursesIn = (JSONArray) objRoot.get("courses");
            
            for (int i = 0; i < coursesIn.size(); i++){
                JSONObject courseIn = (JSONObject) coursesIn.get(i);
                long gradeIn = (long) courseIn.get("grade");
                String nameIn = (String) courseIn.get("name");
                System.out.printf("Course %s; grade %d\n", nameIn, gradeIn);
                }
            
        } catch (FileNotFoundException ex) {
            System.err.println(ex.toString());
        } catch (ParseException ex) {
            System.out.println(ex.toString());
        }
        }
    }