package com.codelooru.beaninit;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.codelooru.pojo.UserService;

public class SpringBeanInitializationTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = appcontext.getBean("userService", UserService.class);
		Assert.notNull(service);
		
		appcontext.close();
	}

}
