package com.codelooru.custns;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

import com.codelooru.dos.MyDAO;
import com.codelooru.dos.MyService;

public class CustomNamespaceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appcontext = new ClassPathXmlApplicationContext("beans.xml");
		MyService service = appcontext.getBean("myservice-123", MyService.class);
		MyDAO dao = appcontext.getBean("mydao-123", MyDAO.class);
		
		Assert.isTrue(dao == service.getDefaultDao());
		//service.getDaoRegistry().get(arg0);
		System.out.println(Arrays.toString(dao.getFields().toArray()));
		
		appcontext.close();
	}
}
