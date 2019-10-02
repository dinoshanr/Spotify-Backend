package com.example.springbootmonolith.Repositories;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.springbootmonolith.Models.Song;

public interface SongRepository extends CrudRepository<Song, Long> {

}

