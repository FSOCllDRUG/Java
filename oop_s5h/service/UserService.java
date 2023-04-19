package oop_s5h.service;

import oop_s5h.model.User;
import oop_s5h.view.Messages;

public class UserService {
    public User createUser(int id, String name){
        return new User(id,name);
    }
    public void changeBalance(User user, int amount){
        user.changeBalance(amount);
        Messages.ShowOperation(amount);
    }
}
