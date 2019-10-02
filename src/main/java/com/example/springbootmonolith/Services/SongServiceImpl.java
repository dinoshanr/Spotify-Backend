package com.example.springbootmonolith.Services;
import com.example.springbootmonolith.Models.Song;
import com.example.springbootmonolith.Repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService{

    @Autowired
    SongRepository songRepository;

    @Override
    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public Iterable<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public void deleteById(Long songId){
        songRepository.deleteById(songId);
    }
}

