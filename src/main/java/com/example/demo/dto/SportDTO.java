package com.example.demo.dto;

public class SportDTO {
    private String name;
    private String moment;

    public SportDTO() {
    }

    public SportDTO(String name, String moment) {
        this.name = name;
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }
}
