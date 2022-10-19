package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "sports")
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String moment;

    public Sport() {
    }

    public Sport(Long id, String name, String moment) {
        this.id = id;
        this.name = name;
        this.moment = moment;
    }

    public Long getId() {
        return id;
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
