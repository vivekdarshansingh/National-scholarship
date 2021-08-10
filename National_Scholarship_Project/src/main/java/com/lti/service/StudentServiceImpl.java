package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.dao.StudentDaoImpl;
import com.lti.entity.StudentReg;

public class StudentServiceImpl {
	
	  
		@Autowired
		private StudentDaoImpl studentdao;
		
		public void register(StudentReg studentReg) {
			studentReg.setStudId(studentReg.getStudId());
			
			
	
			
		}

	}


