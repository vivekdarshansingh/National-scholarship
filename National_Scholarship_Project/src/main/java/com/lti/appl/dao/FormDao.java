package com.lti.appl.dao;

import java.util.List;

import com.lti.appl.beans.Form;
import com.lti.appl.beans.StudentReg;

public interface FormDao {
	
	public void saveForm(Form f);
	public List<Form> displayAll();
	

}
