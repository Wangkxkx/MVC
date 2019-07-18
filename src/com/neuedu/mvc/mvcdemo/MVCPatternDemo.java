package com.neuedu.mvc.mvcdemo;

import com.neuedu.mvc.controller.StudentController;
import com.neuedu.mvc.entry.Student;
import com.neuedu.mvc.view.StudentView;

public class MVCPatternDemo {
    public static void main(String[] args) {

        //从数据库获取学生记录
        Student model = retrieveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();
        //将对应的视图和数据传入Controller
        StudentController controller = new StudentController(model, view);
        //将模型数据更新到视图
        controller.updateView();
        //更新模型数据
        controller.setStudentName("John");
        //将模型数据更新到视图
        controller.updateView();

        /*-----------------------------------------------------------------------------------------*/
        /*
        * 在web编程中，发送对应的请求数据；
        * controller 接受数据并发送到service层
        * service 处理业务逻辑问题；并把从dao层查询出的数据处理；将处理后的数据返回service层
        * dao 层查询并返回数据
        * controller 接受service返回的数据，并将数据渲染到对应的视图；将视图和数据返回客户端供客户查看
        * */
        // 通过后台数据库查询编号为12的学生
        controller.getStudent("12", view);
        controller.updateView();

    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("啦啦啦");
        student.setRollNo("10");
        return student;
    }
}