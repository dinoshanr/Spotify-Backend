package com.example.springbootmonolith.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.springbootmonolith.Models.User;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("FROM User u WHERE u.username = ?1 AND u.password=?2")
    public User login(String username, String password);

}
