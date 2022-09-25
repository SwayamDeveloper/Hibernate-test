package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Student {

	
	@Id
	@Column(name = "myid")
	private int id;
	@Column(name = "myname")
	private String name;
	@Column(name = "myemail")
	private String email;
	@Column(name = "dept")
	private String dept;
	@Column(name = "salary")
	private int salary;
	
	public Student() {
		
	}
	public Student(int id, String name, String email, String dept, int salary) {
	    super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.salary = salary;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getdept() {
		return dept;
	}
	public void  setdept(String dept) {
		this.dept = dept;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ",dept=" + dept+ ",salary=" + salary+ "]";
	}
}
