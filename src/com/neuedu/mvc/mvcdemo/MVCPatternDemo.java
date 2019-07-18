package com.neuedu.mvc.mvcdemo;

import com.neuedu.mvc.controller.StudentController;
import com.neuedu.mvc.entry.Student;
import com.neuedu.mvc.view.StudentView;

public class MVCPatternDemo {
    public static void main(String[] args) {

        //�����ݿ��ȡѧ����¼
        Student model = retrieveStudentFromDatabase();

        //����һ����ͼ����ѧ����ϸ��Ϣ���������̨
        StudentView view = new StudentView();
        //����Ӧ����ͼ�����ݴ���Controller
        StudentController controller = new StudentController(model, view);
        //��ģ�����ݸ��µ���ͼ
        controller.updateView();
        //����ģ������
        controller.setStudentName("John");
        //��ģ�����ݸ��µ���ͼ
        controller.updateView();

        /*-----------------------------------------------------------------------------------------*/
        /*
        * ��web����У����Ͷ�Ӧ���������ݣ�
        * controller �������ݲ����͵�service��
        * service ����ҵ���߼����⣻���Ѵ�dao���ѯ�������ݴ��������������ݷ���service��
        * dao ���ѯ����������
        * controller ����service���ص����ݣ�����������Ⱦ����Ӧ����ͼ������ͼ�����ݷ��ؿͻ��˹��ͻ��鿴
        * */
        // ͨ����̨���ݿ��ѯ���Ϊ12��ѧ��
        controller.getStudent("12", view);
        controller.updateView();

    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("������");
        student.setRollNo("10");
        return student;
    }
}