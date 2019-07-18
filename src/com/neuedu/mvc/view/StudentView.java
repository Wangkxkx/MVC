package com.neuedu.mvc.view;

public class StudentView {
    /**
     * 展示学生信息
     *
     * @param studentName
     * @param studentRollNo
     */
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("学生: ");
        System.out.println("姓名: " + studentName);
        System.out.println("编号: " + studentRollNo);
    }

}