/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.SI.ui;

import com.thiszbimal.SI.entity.Student;
import com.thiszbimal.SI.service.StudentServiceLayer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class StudentUI {
    private Scanner input;
    private StudentServiceLayer studentService;
    
    
    public StudentUI(Scanner input, StudentServiceLayer studentService){
        this.input=input;
        this.studentService=studentService;
    }
    public void AddScreen(){
        while(true) {
                Student student = new Student();
                System.out.println("Enter Id:");
                student.setId(input.nextInt());
                System.out.println("Enter First Name:");
                student.setFirstName(input.next());
                System.out.println("Enter Last Name:");
                student.setLastName(input.next());
                System.out.println("Enter Contact No:");
                student.setContactNo(input.next());
                System.out.println("Enter Address:");
                student.setAddress(input.next());
                System.out.println("Enter Email:");
                student.setEmail(input.next());
                System.out.println("Enter join Date:");
                try{
                DateFormat df = new SimpleDateFormat("yy/mm/dd");
                student.setJoinDate(df.parse(input.next()));
                }catch(ParseException pe){
                    System.out.println(pe.getMessage());
                }
                System.out.println("Enter Status:");
                student.setStatus(input.nextBoolean());

                studentService.insert(student);

                System.out.println("Do you want to continue??(Y/N)");
                if(input.next().equalsIgnoreCase("n")){

                break;
                }
            }
        }
    public void showAllScreen(){
        System.out.println("Printing all Students:");
        System.out.println("======================");
        studentService.getAll().forEach(s->{
        System.out.println(s.toString());
        });
    }
    public void exitScreen(){
        System.out.println("Doyou want to continue??(Y/N)");
        if(input.next().equalsIgnoreCase("n")){
        System.exit(0);
        }
    }
    public void deleteStudent(){
        System.out.println("Enter id of a student that you want to delete:");
        studentService.delete(input.nextInt());
    }
    public void searchByIDScreen(){
        System.out.println("Enter id of student you want to search");
        
        System.out.println(studentService.getById(input.nextInt()).toString());
        
    }
    
}
