package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.dao.StudentDao;
import com.lti.entity.StudentReg;

public class StudentServiceImpl implements StudentService {
	
	  
		@Autowired
		private StudentDao studentdao;

		public StudentDao getStudentdao() {
			return studentdao;
		}

		public void setStudentdao(StudentDao studentdao) {
			this.studentdao = studentdao;
		}
		
		@Override
		public void newStudentReg(StudentReg a) {
			
			studentdao.newStudentReg(a);
		}

	}


