package scr.Services;

import scr.Body.User;

import java.util.ArrayList;
import java.util.List;

public class UserServices {


    List<User> userList = new ArrayList<>();

    public UserServices() {
    };

    public List<User> getUserList() {
        return userList;
    }

    public void addNewUser(User user){

        userList.add(user);
    }
    public void removeUser(int id){
    for (User user : userList){
    if(user.getId() == id){
        userList.remove(user);
        break;
    }
    }
    }

}
