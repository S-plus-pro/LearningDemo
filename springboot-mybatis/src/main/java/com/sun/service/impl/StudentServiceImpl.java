package com.sun.service.impl;

import com.sun.entity.Student;
import com.sun.mapper.StudentMapper;
import com.sun.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author summer
 * @date 2022-05-04  15:17
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectStudentById(Integer id) {

        return studentMapper.selectStudentById(id);
    }

    @Override
    public List<Student> selectAllStudent() {

        return studentMapper.selectAllStudent();
    }
}