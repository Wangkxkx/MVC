package com.neuedu.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import com.neuedu.mvc.entry.Student;

public class StudentFromDatabase {
	/**
     * �����ݿ��ѯѧ������
     *
     * @return
     */
    public static List<Student>  retrieveStudentFromD(){
        List<Student> result= new ArrayList();
        for(int i = 0; i<20;i++){
            Student student = new Student();
            student.setName("������"+i);
            student.setRollNo(String.valueOf(i));
            result.add(student);
        }
        return result;
    }
    /**
     * ����ѧ��
     * @return
     */
    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("������");
        student.setRollNo("10");
        return student;
    }
}
