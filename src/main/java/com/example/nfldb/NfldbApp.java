package com.example.nfldb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.nfldb.controller.*;
<<<<<<< HEAD

import jakarta.annotation.PostConstruct;

@SpringBootApplication
=======
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
>>>>>>> a1b1c22a93ef17e8ea8bfcd4f616e4c70bc235fe
class NfldbApp {

	public static void main(String[] args) {
		SpringApplication.run(NfldbApp.class, args);

		StatisticsController controller = new StatisticsController();
<<<<<<< HEAD

		System.out.println(controller.getPassingStats());
=======
		System.out.println(controller.getPassingStats("Tom Brady"));
>>>>>>> a1b1c22a93ef17e8ea8bfcd4f616e4c70bc235fe
	}
}
