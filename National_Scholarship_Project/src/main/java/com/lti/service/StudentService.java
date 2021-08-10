package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.dao.StudentDao;
import com.lti.entity.StudentReg;

public class StudentService {
	
	  
		@Autowired
		private StudentDao studentdao;
		
		public void register(StudentReg studentReg) {
			studentReg.setStudId(studentReg.getStudId());
			
			
			
			
		}

	}


