/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.SI;

import com.thiszbimal.SI.entity.Student;
import com.thiszbimal.SI.service.StudentServiceLayer;
import com.thiszbimal.SI.service.impl.StudentServiceImpl;
import com.thiszbimal.SI.ui.StudentUI;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class program {

    /**
     * @param args the command line arguments
     */
    //Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentServiceLayer studentService = new StudentServiceImpl(new Vector<>());
        //StudentUI studentUI = new StudentUI(new Scanner(System.in), new StudentServiceImpl(new Vector<>()));
        StudentUI studentUI = new StudentUI(input, studentService);
        while(true){
            System.out.println("Welcome to Student Information System");
            System.out.println("=====================================");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Show All");
            System.out.println("5. Search By Id");
            System.out.println("6. Search By Any");
            System.out.println("7. Exit");
            System.out.println("Enter your Choice(1-7)");

            int key = input.nextInt();

        switch(key){
            case 1:
                studentUI.AddScreen();
                break;
                
            case 2:
                break;
            case 3:
                studentUI.deleteStudent();
                break;
            case 4:
                studentUI.showAllScreen();
                break;
            case 5:
                studentUI.searchByIDScreen();
                break;
            case 6:
                break;
            case 7:
                studentUI.exitScreen();
                break;
        
            
            }

   
    }
    
}
    
    
}
