package com.example.demo;

import com.example.demo.dao.HobbieDao;
import com.example.demo.model.Anime;
import com.example.demo.model.Sport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private HobbieDao hobbieDao;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Anime dbz=new Anime();
		dbz.setAutor("Akira");
		dbz.setName("Dbz");
		dbz.setRelease(new Date());
		hobbieDao.save(dbz);*/
		Sport sport=new Sport();
		sport.setName("Futbol");
		sport.setMoment("Solo sabados");
		hobbieDao.save(sport);
	}
}
