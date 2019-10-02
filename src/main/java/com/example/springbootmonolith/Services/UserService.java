package com.example.springbootmonolith.Services;

import com.example.springbootmonolith.Models.User;
import org.springframework.http.HttpStatus;

public interface UserService {

    public Iterable<User> listUsers();

    public User createUser(User newUser);
    public User login(String username, String password);

    public void deleteById(Long userId);


}
