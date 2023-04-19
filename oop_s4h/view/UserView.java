package oop_s4h.view;


import oop_s4h.data.Student;
import oop_s4h.data.User;

import java.util.List;

public interface UserView<T extends User>{

    T sendOnConsole(List<User> userListlist);
}