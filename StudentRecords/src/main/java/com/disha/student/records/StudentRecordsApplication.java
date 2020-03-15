package com.disha.student.records;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.disha.student.controller","com.disha.student.service"})
@EntityScan("com.disha.student.entity")
@EnableJpaRepositories("com.disha.student.repos")
public class StudentRecordsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRecordsApplication.class, args);
	}

}
