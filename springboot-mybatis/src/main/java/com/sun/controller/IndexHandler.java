package com.sun.controller;

import com.sun.entity.Student;
import com.sun.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/display")
public class IndexHandler {

    @Autowired
    private StudentService studentService;

    @GetMapping("/display")
    public String display(Model model){

        System.out.println("display......");

        List<Student> list=new ArrayList<>();
        list = studentService.selectAllStudent();

        model.addAttribute("list", list);

        return "display";
    }
}

