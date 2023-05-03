package oop_s4h.controller;


import oop_s4h.data.Student;
import oop_s4h.data.Teacher;
import oop_s4h.data.User;
import oop_s4h.service.StudentGroupService;
import oop_s4h.service.StudentService;
import oop_s4h.view.StudentView;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class StudentController implements UserController<Student>{

    private final StudentService dataService = new StudentService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
//        List<Student> studentList = dataService.getAll();
//        studentView.sendOnConsole(studentList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);

    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);

    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();

    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
       return studentGroupService.getSortedByFIOStudentGroup();

    }
}