package com.wowoni.springrest.services;

import java.util.List;

import com.wowoni.springrest.entity.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);

}
