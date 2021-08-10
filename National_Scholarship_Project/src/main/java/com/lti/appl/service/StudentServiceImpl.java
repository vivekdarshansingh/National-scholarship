package com.lti.appl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.beans.StudentReg;
import com.lti.appl.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	
	  
		@Autowired
		private StudentDao studentDao;

		public StudentDao getStudentDao() {
			return studentDao;
		}

		public void setStudentdao(StudentDao studentDao) {
			this.studentDao = studentDao;
		}
		
		@Override
		public int saveStudentReg(StudentReg a) {
			System.out.println("Service Layer---");
			studentDao.saveStudentReg(a);
			return 0;
		}

	}


