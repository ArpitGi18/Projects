package com.javaguides.sms.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.javaguides.sms.Entity.Student;
import com.javaguides.sms.Service.Implementation.StudentService;


@Controller
public class StudentController {
	
	private StudentService studentService;
	
	public StudentController(StudentService studentService)
	{
		this.studentService=studentService;
	}
	
	@GetMapping("/students")
	public String getstudents(Model model)
	{
		List<Student> students=studentService.getstudents();
		model.addAttribute("students",students);
		return "students";
		
	}
	
	@GetMapping("/students/new")
	public String createstudentform(Model model)
	{
		//Create Empty student object to hold student data, The form loaded will have empty object data
		Student student=new Student();
		model.addAttribute("student",student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudents(@ModelAttribute("student") Student student)
	{
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{idLong}")
	public String editstudent(@PathVariable Long idLong , Model model)
	{
		 model.addAttribute("student",studentService.getstudentbyStudentid(idLong));
		 return "edit_student";
	}
	
	@PostMapping("/students/{idLong}")
	public String updatestudent(@PathVariable Long idLong , @ModelAttribute("student") Student student , Model model)
	{
		//First Fetch the student from DB
		Student existstudent=studentService.getstudentbyStudentid(idLong);
		existstudent.setIdLong(student.getIdLong());
		existstudent.setFirstnameString(student.getFirstnameString());
		existstudent.setLastnameString(student.getLastnameString());
		existstudent.setEmailString(student.getEmailString());
		
		studentService.updateStudent(existstudent);
		
		return "redirect:/students";
		
	}
	
	@GetMapping("/students/{idLong}")
	public String deletestudent(@PathVariable Long idLong)
	{
		studentService.deletestudentbyid(idLong);
		return "redirect:/students";
	}
	
	

}
