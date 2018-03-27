package com.alexandrefradet.resume.manager;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrefradet.resume.model.Skill;

public interface SkillManager extends JpaRepository<Skill, Long> {

}
