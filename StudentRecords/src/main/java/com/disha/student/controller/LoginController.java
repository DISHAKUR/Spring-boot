package com.disha.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.disha.student.entity.Students;
import com.disha.student.repos.StudentRepository;
import com.disha.student.service.StudentService;
import com.disha.student.service.StudentsServiceImpl;
import com.disha.student.util.EmailUtil;

@Controller
public class LoginController {

		@Autowired
		StudentService service;
		
		@Autowired
		EmailUtil emailUtil;
		
		@RequestMapping("/showCreate")
		public String showCreate() {
			return "studentForm";
		}
		
		@RequestMapping("/saveRecord")
		public String saveRecord(@ModelAttribute("students") Students students, ModelMap modelMap) {
			// call the service to save the student record
			
			Students std = service.saveStudent(students);
			String msg = "Student Record has been succesfully saved with id: " + std.getId();
			modelMap.addAttribute("msg",msg);
			emailUtil.sendEmail("disha.alag@gmail.com", "Check Email", "Record Added");
			return "studentForm";
		}
		
		@RequestMapping("/displayStudents")
		public String displayStudents(ModelMap modelMap) {
			List<Students> students = service.getAllStudents();
			modelMap.addAttribute("students", students);
			return "viewStudents";
		}
		
		@RequestMapping("/deleteRecord")
		public String deleteRecord(@RequestParam("id") Long id, ModelMap modelMap) {
			// call the service to save the student record) {
			//Students std = service.getStudent(id);
			// OR
			Students std = new Students();
			std.setId(id);
			service.deleteStudent(std);
			// once we have delete the record : get all the records
			List<Students> students = service.getAllStudents();
			modelMap.addAttribute("students", students);
			
			return "viewStudents";
		}
		
		
		@RequestMapping("/editRecord")
		public String editRecord(@RequestParam("id") Long id, ModelMap modelMap) {
			// call the service to save the student record) {
			Students student = service.getStudent(id);
			modelMap.addAttribute("student", student);	
			return "editStudent";
		}
		
		@RequestMapping("/updateRecord")
		public String updateRecord(@ModelAttribute("students") Students student, ModelMap modelMap) {
			// call the service to save the student record
			
			service.updateStudent(student);
			// once we have uoadted the record : get all the records
			List<Students> students = service.getAllStudents();
			modelMap.addAttribute("students", students);
			
			return "viewStudents";
		}
		
		
}
