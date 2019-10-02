package com.example.springbootmonolith.Controller;

import com.example.springbootmonolith.Models.Song;
import com.example.springbootmonolith.Services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class SongController {

    @Autowired
    private SongService songService;

    @GetMapping("/song/list")
    public Iterable<Song> listSongs(){
        return songService.listSongs();
    }

    @PostMapping("/addSong")
    public Song createSong(@RequestBody Song newSong){
        return songService.createSong(newSong);
    }


    @DeleteMapping("/song/{songId}")
    public void deleteSongById(@PathVariable long songId){
        songService.deleteById(songId);
    }

}
