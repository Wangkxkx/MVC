package com.neuedu.mvc.view;

public class StudentView {
    /**
     * չʾѧ����Ϣ
     *
     * @param studentName
     * @param studentRollNo
     */
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("ѧ��: ");
        System.out.println("����: " + studentName);
        System.out.println("���: " + studentRollNo);
    }

}