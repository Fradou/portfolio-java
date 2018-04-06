package com.alexandrefradet.resume.manager;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrefradet.resume.model.Experience;

public interface ExperienceManager extends JpaRepository<Experience, Long> {

}
