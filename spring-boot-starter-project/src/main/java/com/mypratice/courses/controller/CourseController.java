package com.mypratice.courses.controller;
//Expose a web URL --> Rest API
//Simple Rest API

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypratice.courses.bean.Courses;

@RestController
public class CourseController {
	
	@GetMapping("/courses")
	public List<Courses> GetAllCourses(){
		return Arrays.asList(
				new Courses (
						1, 
						"Learn SpringBoot",
						"TechMasters"));
	}
	@GetMapping("/courses/1")
	public List<Courses> GetCorseDetails(){
		return Arrays.asList(
				new Courses (
						2, 
						"Something Known about Springboot",
						"TechMasters_known"));
	}
}
