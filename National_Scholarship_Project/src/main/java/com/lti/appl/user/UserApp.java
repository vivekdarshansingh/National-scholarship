package com.lti.appl.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.appl.beans.StudentReg;
import com.lti.appl.service.StudentService;
import com.lti.appl.service.StudentServiceImpl;

public class UserApp {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Config.xml");
		StudentService service = ctx.getBean("studentService", StudentServiceImpl.class);
		
		StudentReg sr= new StudentReg(1, "Jay", "1", "M", "1234", "ajay@gmail.com", "7890", "MP", "Indore", "3456", "HDFC", 5678, 2);
		sr.setStudId(101);
		sr.setStudName("Vijay");
		service.saveStudentReg(sr);
	
		
	}


}
