package com.StudentManagement.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.StudentManagement.Api.Student;
import com.StudentManagement.rowmapper.StudRowMapper;

@Repository
public class StudentDaoImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	 
	public List<Student> loadStudents() {
			
	String sql = "select * from students";
	List<Student> studentList =jdbcTemplate.query(sql,new StudRowMapper());
		return studentList;
	}

	@Override
	public void saveStudent(Student student) {
		
	Object[] sqlParameters={student.getName(),student.getMobile(),student.getCountry(),student.getDob(),student.getBlood_group(),student.getGender(),student.getC(),student.getJava(),student.getPython(),student.getDs(),student.getTotal()};	
	String sql="insert into students(name,mobile,country,dob,blood_group,gender,c,java,python,ds,total) values(?,?,?,?,?,?,?,?,?,?,?)";	
	jdbcTemplate.update(sql,sqlParameters);	
	System.out.println("1 record submitted");
	}

	@Override
	public Student getStudent(int id) {
		String sql="select * from students where id=?";
		Student student = jdbcTemplate.queryForObject(sql,new StudRowMapper(), id);
		return student;
	}

	@Override
	public Student getStudentdetails(int id) {
		String sql="select * from students where id=?";
		Student student = jdbcTemplate.queryForObject(sql,new StudRowMapper(), id);
		return student;
	}

	@Override
	public void updateStudent(Student student) {
	String sql="UPDATE students SET name = ?, mobile = ?, country = ?, dob = ?, blood_group = ?, gender = ?, c = ?, java = ?, python = ?, ds = ?, total = ? WHERE id = ?";
	jdbcTemplate.update(sql , student.getName(),student.getMobile(),student.getCountry(),student.getDob(),student.getBlood_group(),student.getGender(),student.getC(),student.getJava(),student.getPython(),student.getDs(),student.getTotal(),student.getId());	
	System.out.println("1 record updated");
	
	}

	@Override
	public void deleteStudent(int id) {
		String sql = "DELETE FROM STUDENTS WHERE ID = ?";
		jdbcTemplate.update(sql,id);
		
	}
	
	@Override
	public List<Student> searchStudent(String txt) {
		String sql ="select * from students where name like '%"+txt+"%'";
		List<Student> searchstudentList =jdbcTemplate.query(sql,new StudRowMapper());
		return searchstudentList;
	}

	
}
