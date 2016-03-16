/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.SI.studentDao.impl;

import com.thiszbimal.SI.entity.Student;
import com.thiszbimal.SI.studentDao.StudentDAO;
import java.util.List;

/**
 *
 * @author admin
 */
public class StudentDaoImpl implements StudentDAO{
    
    private List<Student> studentList;

    public StudentDaoImpl(List<Student> studentList) {
        this.studentList = studentList;
    }
    
    

    @Override
    public void insert(Student student) {
        studentList.add(student);
    }

    @Override
    public void update(Student student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
       boolean success = false;
       for(Student student: studentList){
           if(student.getId()==id){
               studentList.remove(student);
               success = true;
               break;
           }
       } 
       return success;
    } 

    @Override
    public Student getById(int id) {
        Student s = null;
        for(Student student: studentList){
           if(student.getId()==id){
               s=student;
               break;
               
           }
       } return s; 
        
    }

    @Override
    public List<Student> search(String param) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }
    
    
    
}
