package com.example.Student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="project")
@AllArgsConstructor
@NoArgsConstructor
public class Project {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long project_id;
private String Project_name;
private String Project_description;
@ManyToOne
@JoinColumn(name = "Student_id")
Student student;



}
