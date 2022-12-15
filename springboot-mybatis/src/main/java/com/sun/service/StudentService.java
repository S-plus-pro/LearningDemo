package com.sun.service;

import com.sun.entity.Student;

import java.util.List;

/**
 * @author summer
 * @date 2022-05-04  15:16
 */
public interface StudentService {
    Student selectStudentById(Integer id);

    List<Student> selectAllStudent();
}