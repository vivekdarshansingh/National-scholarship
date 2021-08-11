package com.lti.appl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.beans.Form;
import com.lti.appl.beans.StudentReg;
import com.lti.appl.dao.FormDao;
import com.lti.appl.dao.StudentDao;

@Service("FormService")
public class FormServiceImpl implements FormService {
	
	@Autowired
	private FormDao formDao;

	public FormDao getFormDao() {
		return formDao;
	}

	public void setFormDao(FormDao formDao) {
		this.formDao = formDao;
	}


	@Override
	public int saveForm(Form f) {
		System.out.println("Service Layer---");
		formDao.saveForm(f);
		return 0;
	}
	
	@Override
	public List<Form> displayAll() {
		System.out.println("Service Layer2---");
		return formDao.displayAll();
	}
	
	

}
