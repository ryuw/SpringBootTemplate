package com.ryuw.SpringBootTemplate.entity;

import lombok.Data;

@Data
public class SpringBootTemplateEntity {
	private int sequence;
	private String title;
	private String detail;
	private boolean deleted;
}
