package com.naveejr.courseserver.repository;

import com.naveejr.courseserver.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
