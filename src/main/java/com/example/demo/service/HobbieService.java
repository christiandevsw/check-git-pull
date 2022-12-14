package com.example.demo.service;

import com.example.demo.dao.HobbieDao;
import com.example.demo.dto.AnimeDTO;
import com.example.demo.model.Anime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HobbieService {
    @Autowired
    private HobbieDao hobbieDao;

    private AnimeDTO convertEntityToDTO(Anime anime){
        AnimeDTO animeDTO=new AnimeDTO();
        animeDTO.setName(anime.getName());
        animeDTO.setRelease(anime.getRelease());
        return animeDTO;
    }


    public List<AnimeDTO> findAll(){
        return hobbieDao.findAll().stream().map(this::convertEntityToDTO).collect(Collectors.toList());
    }
}
