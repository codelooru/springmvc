package com.codelooru.pojo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("anntInitUserBean")
@Scope("prototype")
public class AnnotUser {

	private String name;
	private String type = "admin";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
