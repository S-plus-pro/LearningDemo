package com.sun.mapper;

import com.sun.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {
    //    添加一个根据id查询对象的方法
    Student selectStudentById(@Param("stuid") Integer id);

    List<Student> selectAllStudent();
}