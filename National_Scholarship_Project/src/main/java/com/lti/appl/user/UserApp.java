package com.lti.appl.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.appl.service.StudentService;

public class UserApp {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Config.xml");
		StudentService service = ctx.getBean("studentService", StudentService.class);
		
		System.out.println(ctx);
	
		
	}


}
