package org.sid.rest42.controller;


import org.sid.rest42.model.User;
import org.sid.rest42.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private Userservice userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getUsers();
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUser(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.suppUser(id);
        return " User deleted successfully!";
    }
    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.getUsers().add(user);
        return " User added successfully!";
    }
}
