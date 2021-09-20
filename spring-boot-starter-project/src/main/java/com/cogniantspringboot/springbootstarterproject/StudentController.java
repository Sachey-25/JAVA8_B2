package com.cogniantspringboot.springbootstarterproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/student")
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
//}
	
	//reference
/*	private final StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		//this.studentService = studentService;
		this.studentService =  studentService;
	}
	
	@GetMapping
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	//Dependency Injection!!!!
	
}*/
}
}