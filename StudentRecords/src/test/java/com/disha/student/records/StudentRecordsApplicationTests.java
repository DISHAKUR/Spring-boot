package com.disha.student.records;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.disha.student.entity.Students;
import com.disha.student.repos.StudentRepository;

@SpringBootTest
class StudentRecordsApplicationTests {

	@Autowired
	StudentRepository studentRepos;
	
	// create a new record
	@Test
	public void createStudent() {
		Students student = new Students();
		//set the records
		student.setName("Disha");
		student.setCourse("Spring MVC");
		student.setSfee(20d);
		
		studentRepos.save(student);
	}
	
	// get a record
	@Test
	public void getStudent() {
		//get the records
		Students std = studentRepos.findById(1l).get();
		System.out.println(std);
	}
	
	// update a record : find a record and then update it
	@Test
	public void updateStudent() {
		//get the records
		Students std = studentRepos.findById(1l).get();
		std.setSfee(30d);
		studentRepos.save(std);
	}

	// delete a record
	@Test
	public void deleteStudent() {
		studentRepos.deleteById(1l);
	}
}
