package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserService {

//    private List<String> username;
//
//    public UserService(List<String> username){
//        this.username = username;
//        System.out.println("user service created");
//    }
//
//    public List<String> getUsername() {
//        return username;
//    }

    public UserService(){
        System.out.println("user service created");
    }

    public void init(){
        System.out.println("post construct phase");
    }

    public void cleanup(){
        System.out.println("pre destroy phase");
    }
}
