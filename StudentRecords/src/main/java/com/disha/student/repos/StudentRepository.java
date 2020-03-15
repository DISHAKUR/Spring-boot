package com.disha.student.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.disha.student.entity.Students;

public interface StudentRepository extends JpaRepository<Students, Long> {

}
