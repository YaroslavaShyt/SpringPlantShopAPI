package com.example.demo.services.user;

import com.example.demo.models.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
     List<User> findAllUsers();
     Optional<User> findUserById(Long id);
     User saveUser(User user);
     void deleteUser(Long id);
     User findByEmail(String email);
}
