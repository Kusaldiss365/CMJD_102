package com.ijse.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.demo.dto.UserPasswordDTO;
import com.ijse.demo.entity.User;

@Service
public interface UserService {
    List<User> getAllUsers();
    User createUser(User user);
    User getUserById(Long id);
    User changeUserPassword(Long id, UserPasswordDTO userPasswordDTO);
}

