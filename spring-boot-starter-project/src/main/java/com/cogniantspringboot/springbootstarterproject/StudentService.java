package com.cogniantspringboot.springbootstarterproject;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

public class StudentService {
	
	@Component
	public class StudentController {
		
		@GetMapping
		public List<Student> getStudents(){
			return List.of(
					new Student(
							1L,
							"sachin",
							"Sachin@hotmail.com",
							27)
					);
	}

}

}
