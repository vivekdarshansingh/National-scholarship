package com.lti.appl.user;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.appl.beans.Form;
import com.lti.appl.beans.StudentReg;
import com.lti.appl.service.FormService;
import com.lti.appl.service.FormServiceImpl;
import com.lti.appl.service.StudentService;
import com.lti.appl.service.StudentServiceImpl;

public class UserApp {
	
	public static void main(String[] args) {

//		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Config.xml");
//		StudentService sr = ctx.getBean("studentService", StudentServiceImpl.class);
		
//		StudentReg sr= new StudentReg(1, "Jay", "1", "M", "1234", "ajay@gmail.com", "7890", "MP", "Indore", "3456", "HDFC", 5678, 2);
//		sr.setStudId(101);
//		sr.setStudName("Vijay");
//		service.saveStudentReg(sr);
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Config.xml");
		FormService service = ctx.getBean("formService", FormServiceImpl.class);
		
		Form ss= new Form();
		ss.setFormId(1);
		
		List<Form> detailsList=service.displayAll(); {
	    System.out.println(detailsList);
	
		
	}


	}
}
