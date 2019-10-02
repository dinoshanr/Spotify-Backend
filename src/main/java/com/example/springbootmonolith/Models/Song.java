package com.example.springbootmonolith.Models;
import javax.persistence.*;

@Entity
@Table(name="songs")
public class Song {

    // Creates primary key unique ID column and
    // auto-generates an id with each new User
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Creates unique username and password columns
    @Column
    private String title;

    @Column
    private String artist;

    @Column
    private String duration;

    public Song(){}

    // column get methods

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }

    // column set methods

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.title = title;
    }

    public void setPassword(String password) {
        this.artist = artist;
    }

    public void setDuration(String duration) { this.duration = duration; }
}
