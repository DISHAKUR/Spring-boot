package com.disha.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disha.student.entity.Students;
import com.disha.student.repos.StudentRepository;

@Service
public class StudentsServiceImpl implements StudentService {

	@Autowired	
	StudentRepository studentRepo;
	
	@Override
	public Students saveStudent(Students std) {
		// create record
		return studentRepo.save(std);
	}

	@Override
	public Students updateStudent(Students std) {
		// TODO Auto-generated method stub
	//	Students student = studentRepo.findById(std.getId()).get();
		return studentRepo.save(std);
	}

	@Override
	public void deleteStudent(Students std) {
		// TODO Auto-generated method stub
		studentRepo.delete(std);
	}

	@Override
	public Students getStudent(Long id) {
		// TODO Auto-generated method stub
		
		return studentRepo.findById(id).get();
	}

	@Override
	public List<Students> getAllStudents() {
		return studentRepo.findAll();
	}

}
