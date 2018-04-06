package com.alexandrefradet.resume.manager;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrefradet.resume.model.Project;

public interface ProjectManager extends JpaRepository<Project, Long> {

}
