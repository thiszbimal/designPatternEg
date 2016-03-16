/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.SI.service.impl;

import com.thiszbimal.SI.entity.Student;
import com.thiszbimal.SI.service.StudentServiceLayer;
import com.thiszbimal.SI.studentDao.StudentDAO;
import com.thiszbimal.SI.studentDao.impl.StudentDaoImpl;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class StudentServiceImpl implements StudentServiceLayer{
    
   private StudentDAO studentDAO;
   public StudentServiceImpl(List<Student> studentList){
       studentDAO=new StudentDaoImpl(studentList);
   }

    @Override
    public void insert(Student student) {
        studentDAO.insert(student);
    }

    @Override
    public void update(Student student) {
        studentDAO.update(student);
    }

    @Override
    public boolean delete(int id) {
        return studentDAO.delete(id);
    }

    @Override
    public Student getById(int id) {
        return studentDAO.getById(id);
    }

    @Override
    public List<Student> search(String param) {
        return studentDAO.search(param);
    }

    @Override
    public List<Student> getAll() {
        return studentDAO.getAll();
    }
    
}
