package com.StudentManagement.Controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.StudentManagement.Api.Student;

import com.StudentManagement.service.StudentService;


@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/showStudent")
	public String showStudentList(Model model) {

		List<Student> studentList = studentService.loadStudents();
		model.addAttribute("students", studentList);
		for (Student stud : studentList) {
			System.out.println(stud);
		}
		return "student-list";
	}

	@GetMapping("/showAddStudent")
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);

		return "add-student";
	}

	@PostMapping("/save-student")
	public String saveStudent(Student student) {

		if(student.getId()==0){
		studentService.saveStudent(student);
		}else
		{
			studentService.updateStudent(student);
		}
		return "redirect:/showStudent";
	}
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId")int id,@ModelAttribute("student")Student student) {
		
		System.out.println(id);
		Student gStudent = studentService.getStudent(id);
		System.out.println(gStudent);
		
		student.setId(gStudent.getId());
		student.setName(gStudent.getName());
		student.setMobile(gStudent.getMobile());
		student.setCountry(gStudent.getCountry());
		student.setDob(gStudent.getDob());
		student.setBlood_group(gStudent.getBlood_group());
		student.setGender(gStudent.getGender());
		student.setC(gStudent.getC());
		student.setJava(gStudent.getJava());
		student.setPython(gStudent.getPython());
		student.setDs(gStudent.getDs());
		student.setTotal(gStudent.getTotal());
		
		return "add-student";
	}

	@RequestMapping("/details/{id}")
	public String detailsofStudent(@PathVariable("id") int id,Model model) {
		
		Student studentList =  studentService.getStudentDetails(id);
		model.addAttribute("student",studentList);
		System.out.println(studentList);
		return "details-student";
	
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("userId") int id) {
		
		studentService.deleteStudent(id);
		return "redirect:/showStudent";
	}
	
	@GetMapping("/search")
	public String searchStudentList(Model model,@RequestParam("userEntered")String text) {

		List<Student> searchstudent= studentService.searchStudent(text);
		System.out.println(searchstudent);
		model.addAttribute("searchstudents",searchstudent);
		
		return "search-list";
	}
	@RequestMapping("/marks/{id}")
	public String markssofStudent(@PathVariable("id") int id,Model model) {
		
		Student studentList =  studentService.getStudentDetails(id);
		model.addAttribute("student",studentList);
		System.out.println(studentList);
		return "marks";
	
	}
}
