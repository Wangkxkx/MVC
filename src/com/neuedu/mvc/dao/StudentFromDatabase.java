package com.neuedu.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import com.neuedu.mvc.entry.Student;

public class StudentFromDatabase {
	/**
     * 从数据库查询学生数据
     *
     * @return
     */
    public static List<Student>  retrieveStudentFromD(){
        List<Student> result= new ArrayList();
        for(int i = 0; i<20;i++){
            Student student = new Student();
            student.setName("啦啦啦"+i);
            student.setRollNo(String.valueOf(i));
            result.add(student);
        }
        return result;
    }
    /**
     * 保存学生
     * @return
     */
    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("啦啦啦");
        student.setRollNo("10");
        return student;
    }
}
