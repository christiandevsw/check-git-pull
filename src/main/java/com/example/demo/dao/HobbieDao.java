package com.example.demo.dao;

import com.example.demo.model.Anime;
import com.example.demo.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbieDao extends JpaRepository<Sport,Long> {
}
