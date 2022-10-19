package com.example.demo.controller;

import com.example.demo.dto.AnimeDTO;
import com.example.demo.service.HobbieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HobbiesController {
    @Autowired
    private HobbieService hobbieService;

    @GetMapping("/animes")
    public List<AnimeDTO> findAll(){
        return hobbieService.findAll();
    }
}
