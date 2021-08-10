package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_REG")
public class StudentReg {
	
	@Id
	@Column(name="STUD_ID")
	private int studId;
	
	@Column(name="STUD_NAME")
	private String studName;
	
	
	@Column(name="STUD_DOB")
	private LocalDate studDOB;
	
	@Column(name="STUD_GENDER")
	private String studGender;
	
	@Column(name="STUD_MOB_NO")
	private long studMobNo;
	
	@Column(name="STUD_EMAIL_ID")
	private String studEmailId;
	
	@Column(name="STUD_PWD")
	private long studPWD;
	
	@Column(name="STUD_STATE_OF_DOMICILE")
	private String studSOD;
	
	@Column(name="STUD_DISTRICT")
	private String studDistrict;
	
	@Column(name="STUD_BANK_ACC_NO")
	private long studBankAcc;
	
	@Column(name="STUD_BANK_IFSC")
	private long ifsc;
	
	@Column(name="STUD_INST_CODE")
	private int studInstCode;
	
	@Column(name="STUD_INST_STATUS")
	private int studInstStatus;
	
	public StudentReg() {
		super();
	}



	public StudentReg(int studId, String studName, LocalDate studDOB, String studGender, long studMobNo,
			String studEmailId, long studPWD, String studSOD, String studDistrict, long studBankAcc, long iFSC,
			int studInstCode, int studInstStatus) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studDOB = studDOB;
		this.studGender = studGender;
		this.studMobNo = studMobNo;
		this.studEmailId = studEmailId;
		this.studPWD = studPWD;
		this.studSOD = studSOD;
		this.studDistrict = studDistrict;
		this.studBankAcc = studBankAcc;
		ifsc = ifsc;
		this.studInstCode = studInstCode;
		this.studInstStatus = studInstStatus;
	}



	public int getStudId() {
		return studId;
	}



	public void setStudId(int studId) {
		this.studId = studId;
	}



	public String getStudName() {
		return studName;
	}



	public void setStudName(String studName) {
		this.studName = studName;
	}



	public LocalDate getStudDOB() {
		return studDOB;
	}



	public void setStudDOB(LocalDate studDOB) {
		this.studDOB = studDOB;
	}



	public String getStudGender() {
		return studGender;
	}



	public void setStudGender(String studGender) {
		this.studGender = studGender;
	}



	public long getStudMobNo() {
		return studMobNo;
	}



	public void setStudMobNo(long studMobNo) {
		this.studMobNo = studMobNo;
	}



	public String getStudEmailId() {
		return studEmailId;
	}



	public void setStudEmailId(String studEmailId) {
		this.studEmailId = studEmailId;
	}



	public long getStudPWD() {
		return studPWD;
	}



	public void setStudPWD(long studPWD) {
		this.studPWD = studPWD;
	}



	public String getStudSOD() {
		return studSOD;
	}



	public void setStudSOD(String studSOD) {
		this.studSOD = studSOD;
	}



	public String getStudDistrict() {
		return studDistrict;
	}



	public void setStudDistrict(String studDistrict) {
		this.studDistrict = studDistrict;
	}



	public long getStudBankAcc() {
		return studBankAcc;
	}



	public void setStudBankAcc(long studBankAcc) {
		this.studBankAcc = studBankAcc;
	}



	public long getifsc() {
		return ifsc;
	}



	public void setIFSC(long ifsc) {
		ifsc = ifsc;
	}



	public int getStudInstCode() {
		return studInstCode;
	}



	public void setStudInstCode(int studInstCode) {
		this.studInstCode = studInstCode;
	}



	public int getStudInstStatus() {
		return studInstStatus;
	}



	public void setStudInstStatus(int studInstStatus) {
		this.studInstStatus = studInstStatus;
	}



	@Override
	public String toString() {
		return "StudentReg [studId=" + studId + ", studName=" + studName + ", studDOB=" + studDOB + ", studGender="
				+ studGender + ", studMobNo=" + studMobNo + ", studEmailId=" + studEmailId + ", studPWD=" + studPWD
				+ ", studSOD=" + studSOD + ", studDistrict=" + studDistrict + ", studBankAcc=" + studBankAcc + ", ifsc="
				+ ifsc + ", studInstCode=" + studInstCode + ", studInstStatus=" + studInstStatus + "]";
	}
	
	
	
	

}
