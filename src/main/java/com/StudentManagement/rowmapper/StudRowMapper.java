package com.StudentManagement.rowmapper;
 
import java.sql.ResultSet;
import java.util.Date;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.StudentManagement.Api.Student;
public class StudRowMapper implements RowMapper<Student> {

	
	

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student stud = new Student();
		stud.setId(rs.getInt("id"));
		stud.setName(rs.getString("name"));
		stud.setMobile(rs.getLong("mobile"));
		stud.setCountry(rs.getString("country"));
		stud.setDob(rs.getString("dob"));
		stud.setBlood_group(rs.getString("blood_group"));
		stud.setGender(rs.getString("gender"));
		stud.setC(rs.getLong("c"));
		stud.setJava(rs.getLong("java"));
		stud.setPython(rs.getLong("python"));
		stud.setDs(rs.getLong("ds"));
		stud.setTotal(rs.getLong("total"));
		return stud;
	}

}

