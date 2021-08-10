package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.StudentReg;

public class StudentDaoImpl {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Transactional
	public Long readLogin(String studentEmail, String studentPassword) {
//		Query q = entityManager.createQuery(
//				"Select count(s) from STUDENT_REG s where s.STUD_EMAIL_ID = :studentEmail and s.STUD_PWD=:password");
//		q.setParameter("studentEmail", studentEmail);
//		q.setParameter("password", studentPassword);
//		Long count = (Long) q.getSingleResult();
		return null;
	}
	
	


	
	

}
