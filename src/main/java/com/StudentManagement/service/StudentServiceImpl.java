package com.StudentManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagement.Api.Student;
import com.StudentManagement.Dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
     private StudentDAO studentDAO;
	@Override
	public List<Student> loadStudents() {
		
		List<Student> studentList =studentDAO.loadStudents();
		return studentList;
	}
	@Override
	public void saveStudent(Student student) {
		
		studentDAO.saveStudent(student);
		
	}
	
	@Override
	public Student getStudent(int id) {
		
		return studentDAO.getStudent(id);
	}
	@Override
	public Student getStudentDetails(int id) {
		
		return studentDAO.getStudentdetails(id);
	}
	@Override
	public void updateStudent(Student student) {
		studentDAO.updateStudent(student);
		
	}
	@Override
	public void deleteStudent(int id) {
		
		studentDAO.deleteStudent(id);
	}
	@Override
	public List<Student> searchStudent(String txt) {
	return	studentDAO.searchStudent(txt);
	
	}
	
}
