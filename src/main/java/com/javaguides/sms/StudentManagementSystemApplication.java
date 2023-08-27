package com.javaguides.sms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaguides.sms.Entity.Student;
import com.javaguides.sms.Repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	private StudentRepository studentRepository;
	
	public StudentManagementSystemApplication(StudentRepository studentRepository)
	{
		this.studentRepository=studentRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1=new Student("Arpit","Gupta","arpit@gmail.com"); Student
		 * student2=new Student("Bhattu","Bhatnagar","bhattu@gmail.com");
		 * 
		 * studentRepository.save(student1); studentRepository.save(student2);
		 */
		
		
	}

}
