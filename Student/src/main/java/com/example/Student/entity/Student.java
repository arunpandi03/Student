package com.example.Student.entity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Entity
@Data
@Table(name ="student")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String name;
private String email;
private String dept;
@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
@JoinColumn(name = "Student_id")
private List<Project> projectList;
public Student(Long id, String name, String email, String dept, List<Project> projectList) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.dept = dept;
	this.projectList = projectList;
}
public Student() {
	super();
	
}

}
