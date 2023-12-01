package com.ijse.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ijse.demo.dto.UserPasswordDTO;
import com.ijse.demo.entity.User;
import com.ijse.demo.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PutMapping("/user/{id}/change-password")
    public ResponseEntity<User> changeUserPassword(@PathVariable Long id,@RequestBody UserPasswordDTO userPasswordDTO){
        return ResponseEntity.ok().body(userService.changeUserPassword(id, userPasswordDTO));
    }
}
