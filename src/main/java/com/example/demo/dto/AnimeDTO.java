package com.example.demo.dto;


import java.util.Date;

public class AnimeDTO {
    private String name;
    private Date release;

    public AnimeDTO() {
    }

    public AnimeDTO(String name, Date release) {
        this.name = name;
        this.release = release;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }
}
