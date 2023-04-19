package oop_s4h.view;



import oop_s4h.data.Teacher;
import oop_s4h.data.User;

import java.util.List;


public class TeacherView implements UserView<Teacher> {


    @Override
    public Teacher sendOnConsole(List<User> userListlist) {
        return (Teacher) userListlist.get(0);
    }


}