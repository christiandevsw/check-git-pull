package com.example.demo.dao;

import com.example.demo.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbieDao extends JpaRepository<Anime,Long> {
}
