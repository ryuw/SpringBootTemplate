package com.ryuw.SpringBootTemplate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ryuw.SpringBootTemplate.entity.SpringBootTemplateEntity;

@RestController
public class SpringBootTemplateController {

	@GetMapping("")
	public ResponseEntity<SpringBootTemplateEntity> index() {
		SpringBootTemplateEntity entity = new SpringBootTemplateEntity();
		entity.setSequence(0);
		entity.setTitle("title");
		entity.setDetail("detail");
		entity.setDeleted(false);
		return ResponseEntity.ok(entity);
	}
}
