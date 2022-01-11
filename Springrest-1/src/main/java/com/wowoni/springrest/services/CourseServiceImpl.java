package com.wowoni.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wowoni.springrest.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"Java Core Course","Basics of java"));
		list.add(new Course(1212,"Springboot","rest api"));
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourse(long courseId) {
		
		Course c=null;
		for(Course course : list)
		{
			if(course.getId()==courseId)
			{
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
