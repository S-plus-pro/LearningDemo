package com.sun.controller;

import com.sun.entity.Student;
import com.sun.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author summer
 * &#064;date  2022-05-04  15:19
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getStudent")
    @ResponseBody
    public String getStudent(Integer id) {
        Student student = studentService.selectStudentById(id);
        return student.toString();
    }

    @RequestMapping("/getAllStudent")
    @ResponseBody
    public List<Student> getAllStudent() {
        List<Student> student = studentService.selectAllStudent();
        return student;
    }
}