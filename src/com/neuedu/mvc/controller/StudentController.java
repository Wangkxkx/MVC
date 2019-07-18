package com.neuedu.mvc.controller;

import com.neuedu.mvc.entry.Student;
import com.neuedu.mvc.service.StudentService;
import com.neuedu.mvc.view.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;
    
    public void getStudent(String rollNo,StudentView view){
        this.model =StudentService.SelectStudent(rollNo);
        this.view = view;
    }


    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}