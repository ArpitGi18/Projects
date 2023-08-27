package com.javaguides.sms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaguides.sms.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	
}
