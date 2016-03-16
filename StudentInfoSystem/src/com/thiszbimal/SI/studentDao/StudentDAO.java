/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thiszbimal.SI.studentDao;

import com.thiszbimal.SI.entity.Student;
import java.util.List;

/**
 *
 * @author admin
 */
public interface StudentDAO {
    
    void insert(Student student);
    void update(Student student);
    boolean delete(int id);
    Student getById(int id);
    List<Student> search(String param);
    List<Student> getAll();
    
}
