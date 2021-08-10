package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_PDETAILS")
public class StudentPersDetail {
	
	@Id
	@Column(name="STUD_FORM_ID")
	private int studFormId;
	
	@Column(name="STUD_SCHEME_ID")
	private int studSchemeId;
	
	@Column(name="STUD_RELIGION")
	private String religion;
	
	@Column(name="STUD_COMMUNITY")
	private String community;
	
	@Column(name="STUD_FATHER_NAME")
	private String fatherName;
	
	@Column(name="STUD_MOTHER_NAME")
	private String motherName;
	
	@Column(name="STUD_FAMILY_INCOME")
	private double familyIncome;
	
	@Column(name="STUD_ISDISABILITY")
	private int isDisabled;
	
	@Column(name="STUD_TYPE_OF_DISABILITY")
	private String typeOfDisability;
	
	@Column(name="STUD_PROF_FATHER")
	private String fatherProfession;
	
	@Column(name="STUD_PROF_MOTHER")
	private String motherProfession;
	

	public StudentPersDetail() {
		super();
	}


	public StudentPersDetail(int studFormId, int studSchemeId, String religion, String community, String fatherName,
			String motherName, double familyIncome, int isDisabled, String typeOfDisability, String fatherProfession,
			String motherProfession) {
		super();
		this.studFormId = studFormId;
		this.studSchemeId = studSchemeId;
		this.religion = religion;
		this.community = community;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.familyIncome = familyIncome;
		this.isDisabled = isDisabled;
		this.typeOfDisability = typeOfDisability;
		this.fatherProfession = fatherProfession;
		this.motherProfession = motherProfession;
	}


	public int getStudFormId() {
		return studFormId;
	}


	public void setStudFormId(int studFormId) {
		this.studFormId = studFormId;
	}


	public int getStudSchemeId() {
		return studSchemeId;
	}


	public void setStudSchemeId(int studSchemeId) {
		this.studSchemeId = studSchemeId;
	}


	public String getReligion() {
		return religion;
	}


	public void setReligion(String religion) {
		this.religion = religion;
	}


	public String getCommunity() {
		return community;
	}


	public void setCommunity(String community) {
		this.community = community;
	}


	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getMotherName() {
		return motherName;
	}


	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	public double getFamilyIncome() {
		return familyIncome;
	}


	public void setFamilyIncome(double familyIncome) {
		this.familyIncome = familyIncome;
	}


	public int getIsDisabled() {
		return isDisabled;
	}


	public void setIsDisabled(int isDisabled) {
		this.isDisabled = isDisabled;
	}


	public String getTypeOfDisability() {
		return typeOfDisability;
	}


	public void setTypeOfDisability(String typeOfDisability) {
		this.typeOfDisability = typeOfDisability;
	}


	public String getFatherProfession() {
		return fatherProfession;
	}


	public void setFatherProfession(String fatherProfession) {
		this.fatherProfession = fatherProfession;
	}


	public String getMotherProfession() {
		return motherProfession;
	}


	public void setMotherProfession(String motherProfession) {
		this.motherProfession = motherProfession;
	}


	@Override
	public String toString() {
		return "StudentPersDetail [studFormId=" + studFormId + ", studSchemeId=" + studSchemeId + ", religion="
				+ religion + ", community=" + community + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", familyIncome=" + familyIncome + ", isDisabled=" + isDisabled + ", typeOfDisability="
				+ typeOfDisability + ", fatherProfession=" + fatherProfession + ", motherProfession=" + motherProfession
				+ "]";
	}
	
	
	
}
