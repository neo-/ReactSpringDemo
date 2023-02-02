package com.naveejr.courseserver.controller;

import com.naveejr.courseserver.model.Course;
import com.naveejr.courseserver.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class CourseController {

	private final CourseService courseService;

	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourses() {
		return ResponseEntity.ok(courseService.findAllCourses());
	}

	@GetMapping("/courses/{id}")
	public ResponseEntity<Course> getCourse(@PathVariable Long id) {
		Optional<Course> optCourse = courseService.findCourse(id);
		return optCourse.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@PostMapping("/courses")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		try {
			Course retCourse = courseService.createCourse(course);
			return ResponseEntity.ok(retCourse);
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}

	@PutMapping("/courses/{id}")
	public ResponseEntity<Course> editCourse(@PathVariable Long id, @RequestBody Course course) {
		Optional<Course> optCourse = courseService.findCourse(id);
		if (optCourse.isPresent()) {
			Course updateCourse = optCourse.get();
			updateCourse.setCode(course.getCode());
			updateCourse.setName(course.getName());
			updateCourse.setDescription(course.getDescription());
			updateCourse = courseService.editCourse(updateCourse);
			return ResponseEntity.ok(updateCourse);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/courses/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable Long id) {
		try {
			courseService.deleteCourse(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception ex) {
			return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
		}
	}

}
