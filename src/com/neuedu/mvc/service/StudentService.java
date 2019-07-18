package com.neuedu.mvc.service;


import java.util.List;

import com.neuedu.mvc.dao.StudentFromDatabase;
import com.neuedu.mvc.entry.Student;

public class StudentService {

    public static Student SelectStudent(String rollNo){
        // ��dao���ѯ����
        List<Student> studentList =  StudentFromDatabase.retrieveStudentFromD();
        // ����ҵ���߼��󷵻ض�Ӧ������
        for (Student student:studentList){
            if (student.getRollNo().equals(rollNo)){
                return  student;
            }
        }
        return null;
    }

}

