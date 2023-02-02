package com.naveejr.courseserver.service;


import com.naveejr.courseserver.model.Course;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface CourseService {

	List<Course> findAllCourses();

	Course createCourse(Course course);

	Course editCourse(Course course);

	void deleteCourse(Long id);

	Optional<Course> findCourse(Long id);
}
