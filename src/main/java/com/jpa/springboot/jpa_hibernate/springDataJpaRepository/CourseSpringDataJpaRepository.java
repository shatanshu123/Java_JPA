package com.jpa.springboot.jpa_hibernate.springDataJpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.springboot.jpa_hibernate.jdbc.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	List<Course> findByAuthor(String author);
	List<Course>findByName(String name);
}
