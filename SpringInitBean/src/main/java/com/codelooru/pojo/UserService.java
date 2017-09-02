package com.codelooru.pojo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

public class UserService implements InitializingBean {

	private String userprops;
	
	public String getUserprops() {
		return userprops;
	}

	public void setUserprops(String userprops) {
		this.userprops = userprops;
	}

	@PostConstruct
	public void initWithPostConstuctor() {
		System.out.println("PostConstruct method called");
		Assert.notNull(userprops);
	}
	
	public void initWithXMLInitMethod() {
		System.out.println("init-method called");
		Assert.notNull(userprops);
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet for InitializingBean called");
		Assert.notNull(userprops);
	}
}
