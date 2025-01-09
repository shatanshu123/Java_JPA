package com.jpa.springboot.jpa_hibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.springboot.jpa_hibernate.jdbc.course.Course;

@Component
public class JdbcCommandLineRunner implements CommandLineRunner {
	@Autowired
	private JdbcRepository jdbcRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		jdbcRepository.insert(new Course(1,"Learn AWS","Jeff Bezos"));
		jdbcRepository.insert(new Course(2,"Learn Azure","K. Kim"));
		jdbcRepository.insert(new Course(3,"Learn Devops","Andrew Ng"));

		jdbcRepository.deleteById(1l);
		System.out.println(jdbcRepository.findById(2l));
		System.out.println(jdbcRepository.findById(3l));

	}

}
