package com.infy.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.demo.model.Student;

import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/student")
public class StudentController {
	
	@GetMapping(path="id")
	@ApiOperation(value="Get student by id")
	//@ApiImplicitParam(name=AUTHORISATION)
	public Student getStudentById(@RequestParam String id) {
		Student student=new Student();
		student.setId("1");
		student.setName("Isha");
		student.setStd("2");
		
		return student;
		
	}
	

}
