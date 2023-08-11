package com.StudentManagement.Dao;

import java.util.List;

import com.StudentManagement.Api.Student;

public interface StudentDAO {


	public List<Student> loadStudents();
	void saveStudent(Student student);
	Student getStudent(int id);
	Student getStudentdetails( int id);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
	public List<Student> searchStudent(String txt);
}
