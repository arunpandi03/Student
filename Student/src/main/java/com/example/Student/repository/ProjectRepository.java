package com.example.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.entity.Project;


public interface ProjectRepository extends JpaRepository<Project,Long> {

}
