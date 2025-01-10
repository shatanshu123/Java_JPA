package com.jpa.springboot.jpa_hibernate.JpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.springboot.jpa_hibernate.jdbc.course.Course;
import com.jpa.springboot.jpa_hibernate.springDataJpaRepository.CourseSpringDataJpaRepository;

@Component
public class JpaCommandLineRunner implements CommandLineRunner {
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new Course(4, "Learn JDK", "Jeff Bezos"));
		repository.save(new Course(5, "Learn Azure", "K. Kim"));
		repository.save(new Course(6, "Learn Devops", "Andrew Ng"));

		repository.deleteById(5l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		repository.findByAuthor("K. Kim");
		repository.findByName("Learn JDK");
	}

}
