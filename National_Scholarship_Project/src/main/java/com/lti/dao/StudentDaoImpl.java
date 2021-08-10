package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.StudentReg;

@Repository("StudentDao")
public class StudentDaoImpl implements StudentDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public void newStudentReg(StudentReg a) {
		
		System.out.println("Dao Layer...");
		em.persist(a);
			
	}
	
	
	
	}
	
	


	
	


