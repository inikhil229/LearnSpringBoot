package org.learn.service;

import org.learn.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService  {

    private Map<Integer, User> userDb;

    public UserService(){
        this.userDb = new HashMap<>();
    }

    public User getUserById(Integer id){
        return userDb.getOrDefault(id,null);
    }

    public List<User> getAllUsers(){

        List<User> userResponse = new ArrayList<>();
        for(User user : userDb.values()){
            userResponse.add(user);
        }

        return userResponse;
    }

    public User createUser(User user){
        userDb.put(user.getId(),user);
        return user;
    }
}
