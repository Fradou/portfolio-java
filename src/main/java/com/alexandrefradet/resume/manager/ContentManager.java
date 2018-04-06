package com.alexandrefradet.resume.manager;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrefradet.resume.model.Content;

public interface ContentManager extends JpaRepository<Content, Long> {

}
