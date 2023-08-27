package com.javaguides.sms.Service.Implementation;

import java.util.List;
import java.util.Optional;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;
import org.springframework.stereotype.Service;

import com.javaguides.sms.Entity.Student;
import com.javaguides.sms.Repository.StudentRepository;


@Service
public class StudentService implements com.javaguides.sms.Service.StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository)
	{
		this.studentRepository=studentRepository;
	}

	@Override
	public List<Student> getstudents() {
		
		return studentRepository.findAll();
		
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
		
	}

	@Override
	public Student getstudentbyStudentid(Long id) {
		// TODO Auto-generated method stub
		//Find by id returns optional , so we add .get()
		return studentRepository.findById(id).get();
	}

	@Override
	public void deletestudentbyid(Long id) {
		
		//find the student
		Student student=studentRepository.findById(id).get();
		studentRepository.delete(student);
		
	}

}
