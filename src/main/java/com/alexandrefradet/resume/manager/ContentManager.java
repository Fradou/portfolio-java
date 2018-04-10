package com.alexandrefradet.resume.manager;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandrefradet.resume.model.Content;

public interface ContentManager extends JpaRepository<Content, Long> {

	public List<Content> findByLabel(String label);
}
