package com.disha.student.service;

import java.util.List;

import com.disha.student.entity.Students;


public interface StudentService {

	Students saveStudent(Students std);

	Students updateStudent(Students std);

	void deleteStudent(Students std);

	Students getStudent(Long id);

	List<Students> getAllStudents();

}
