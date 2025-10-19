package org.sid.rest42.service;

import org.sid.rest42.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Userservice {
   private final List<User> userList;
   public Userservice() {
       userList = new ArrayList<>();
       User user1 = new User(1,"Mohemed","m@gmail.com");
       User user2 = new User(2,"Misha","m@gmail.com");
       User user3 = new User(3,"Misha","m@gmail.com");
       userList.addAll(Arrays.asList(user1,user2,user3));
   }
   public User getUser(int id) {
       for (User user : userList)
           if (id == user.getId()) {
               return user;
           }
       return null;
       }
   public void suppUser(Integer id) {
       userList.removeIf(user -> id == user.getId());
   }
        public List<User> getUsers() {
       return userList;
        }
   }
