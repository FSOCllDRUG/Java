package oop_s4h.view;



import oop_s4h.data.Student;
import oop_s4h.data.StudentGroup;
import oop_s4h.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{

    Logger logger = Logger.getLogger(StudentView.class.getName());


    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }


    @Override
    public Student sendOnConsole(List<User> userListlist) {
        return (Student) userListlist.get(0);
    }
}