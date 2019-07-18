package com.neuedu.mvc.service;


import java.util.List;

import com.neuedu.mvc.dao.StudentFromDatabase;
import com.neuedu.mvc.entry.Student;

public class StudentService {

    public static Student SelectStudent(String rollNo){
        // 从dao层查询数据
        List<Student> studentList =  StudentFromDatabase.retrieveStudentFromD();
        // 处理业务逻辑后返回对应的数据
        for (Student student:studentList){
            if (student.getRollNo().equals(rollNo)){
                return  student;
            }
        }
        return null;
    }

}

