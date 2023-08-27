package com.javaguides.sms.Service;

import java.util.List;

import com.javaguides.sms.Entity.Student;

public interface StudentService {
	
	public List<Student> getstudents();
	
	public Student saveStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public Student getstudentbyStudentid(Long id);
	
	public void deletestudentbyid(Long id);

}
