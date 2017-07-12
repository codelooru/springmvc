package com.codelooru.lookup;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.codelooru.pojo.AnnotUser;
import com.codelooru.pojo.AnnotUserService;
import com.codelooru.pojo.User;
import com.codelooru.pojo.UserService;

@Configuration
public class LookupMethodTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext("beans.xml");
		
		//For XML based configuration 
		UserService service = appcontext.getBean("userService", UserService.class);
		User newUser1 = service.getInitializedUserInstance();
		User newUser2 = service.getInitializedUserInstance();
		
		Assert.isTrue(newUser1.getType().equals("admin"));
		Assert.isTrue(newUser1 != newUser2);//scope of prototype should return unique instances
		
		User opsUser1 = service.getOperationsUser();
		User opsUser2 = service.getOperationsUser();
		
		Assert.isTrue(opsUser1.getType().equals("operator"));
		Assert.isTrue(opsUser1.getName().equals("John"));
		Assert.isTrue(opsUser1 == opsUser2);//should return the same instance
		
		//For annotation based configuration 
		AnnotUserService serviceAnnot = appcontext.getBean("anntUserService", AnnotUserService.class);
		AnnotUser anUser1 = serviceAnnot.getInitializedUserInstance();
		AnnotUser anUser2 = serviceAnnot.getInitializedUserInstance();
		Assert.isTrue(anUser1 != anUser2);//scope of prototype should return unique instances
		
		appcontext.close();
		
	}
}
