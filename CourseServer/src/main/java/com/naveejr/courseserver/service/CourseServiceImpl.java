package com.naveejr.courseserver.service;

import com.naveejr.courseserver.model.Course;
import com.naveejr.courseserver.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@Service
@Transactional(readOnly = true)
public class CourseServiceImpl implements CourseService {

	private final CourseRepository courseRepository;

	@Override
	public List<Course> findAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Optional<Course> findCourse(Long id) {
		return courseRepository.findById(id);
	}

	@Override
	@Transactional
	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	@Transactional
	public Course editCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	@Transactional
	public void deleteCourse(Long id) {
		courseRepository.deleteById(id);
	}


}
