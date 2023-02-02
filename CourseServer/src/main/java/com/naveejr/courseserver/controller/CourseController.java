package com.naveejr.courseserver.controller;

import com.naveejr.courseserver.model.Course;
import com.naveejr.courseserver.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class CourseController {

	private final CourseService courseService;

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return courseService.findAllCourses();
	}
}
