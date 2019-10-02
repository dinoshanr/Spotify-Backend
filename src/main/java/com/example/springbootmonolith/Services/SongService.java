package com.example.springbootmonolith.Services;
        import com.example.springbootmonolith.Models.Song;

public interface SongService {
    public Song createSong(Song song);

    public Iterable<Song> listSongs();

    public void deleteById(Long songId);
}
