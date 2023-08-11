package com.StudentManagement.Api;

import java.util.Date;

public class Student {

	private int id;
	private String name;
	private Long mobile;
	private String country;
	private String dob;
	private String blood_group;
	private String gender;
	private Long c;
	private Long java;
	private Long python;
	private Long ds;
	private Long total;
	
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getBlood_group() {
		return blood_group;
	}
	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getC() {
	return c;
}
public void setC(Long c) {
	this.c = c;
}
public Long getJava() {
	return java;
}
public void setJava(Long java) {
	this.java = java;
}
public Long getPython() {
	return python;
}
public void setPython(Long python) {
	this.python = python;
}
public Long getDs() {
	return ds;
}
public void setDs(Long ds) {
	this.ds = ds;
}
public Long getTotal() {
	return total;
}
public void setTotal(Long total) {
	this.total = total;
}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", country=" + country + ", dob=" + dob
				+ ", blood_group=" + blood_group + ", gender=" + gender + ", c=" + c + ", java=" + java + ", python="
				+ python + ", ds=" + ds + ", total=" + total + "]";
	}
	public Student(int id, String name, Long mobile, String country, String dob, String blood_group, String gender, Long c,
			Long java, Long python, Long ds, Long total) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.country = country;
		this.dob = dob;
		this.blood_group = blood_group;
		this.gender = gender;
		this.c = c;
		this.java = java;
		this.python = python;
		this.ds = ds;
		this.total = total;
	}
	
	
}
