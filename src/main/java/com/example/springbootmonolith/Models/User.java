package com.example.springbootmonolith.Models;
import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    // Creates primary key unique ID column and
    // auto-generates an id with each new User
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Creates unique username and password columns
    @Column(unique = true)
    private String username;

    @Column
    private String password;

    public User(){}

    // column get methods

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // column set methods

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}