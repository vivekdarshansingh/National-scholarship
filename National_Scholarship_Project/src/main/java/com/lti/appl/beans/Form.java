package com.lti.appl.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="FORM")
public class Form {
	
	@Id
	@GeneratedValue
	@Column(name="FORM_ID")
	private int formId;
	
	@Column(name="DOMICILE")
	private String domicileCertificate;
	
	@Column(name="INCOME_CERTIFI")
	private String incomeCerti;
	
	@Column(name="FEE_CURRYEAR")
	private String feeCurrYear;
	
	@Column(name="BANK_PASSBOOK")
	private String bankPassbook;
	
	@Column(name="AADHAAR_DOC")
	private String aadhaarDoc;
	
	@Column(name="10_MARKSHEET")
	private String tenMarksheet;
	
	@Column(name="12_MARKSHEET")
	private String twelMarsksheet;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="DISTRICT")
	private String district;
	
	@Column(name="PIN_CODE")
	private String pincode;
	
	@Column(name="STREET")
	private String street;
	
	@Column(name="CITY")
	private String city;

	public Form() {
		super();
	}

	public Form(int formId, String domicileCertificate, String incomeCerti, String feeCurrYear, String bankPassbook,
			String aadhaarDoc, String tenMarksheet, String twelMarsksheet, String state, String district,
			String pincode, String street, String city) {
		super();
		this.formId = formId;
		this.domicileCertificate = domicileCertificate;
		this.incomeCerti = incomeCerti;
		this.feeCurrYear = feeCurrYear;
		this.bankPassbook = bankPassbook;
		this.aadhaarDoc = aadhaarDoc;
		this.tenMarksheet = tenMarksheet;
		this.twelMarsksheet = twelMarsksheet;
		this.state = state;
		this.district = district;
		this.pincode = pincode;
		this.street = street;
		this.city = city;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public String getDomicileCertificate() {
		return domicileCertificate;
	}

	public void setDomicileCertificate(String domicileCertificate) {
		this.domicileCertificate = domicileCertificate;
	}

	public String getIncomeCerti() {
		return incomeCerti;
	}

	public void setIncomeCerti(String incomeCerti) {
		this.incomeCerti = incomeCerti;
	}

	public String getFeeCurrYear() {
		return feeCurrYear;
	}

	public void setFeeCurrYear(String feeCurrYear) {
		this.feeCurrYear = feeCurrYear;
	}

	public String getBankPassbook() {
		return bankPassbook;
	}

	public void setBankPassbook(String bankPassbook) {
		this.bankPassbook = bankPassbook;
	}

	public String getAadhaarDoc() {
		return aadhaarDoc;
	}

	public void setAadhaarDoc(String aadhaarDoc) {
		this.aadhaarDoc = aadhaarDoc;
	}

	public String getTenMarksheet() {
		return tenMarksheet;
	}

	public void setTenMarksheet(String tenMarksheet) {
		this.tenMarksheet = tenMarksheet;
	}

	public String getTwelMarsksheet() {
		return twelMarsksheet;
	}

	public void setTwelMarsksheet(String twelMarsksheet) {
		this.twelMarsksheet = twelMarsksheet;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Forms [formId=" + formId + ", domicileCertificate=" + domicileCertificate + ", incomeCerti="
				+ incomeCerti + ", feeCurrYear=" + feeCurrYear + ", bankPassbook=" + bankPassbook + ", aadhaarDoc="
				+ aadhaarDoc + ", tenMarksheet=" + tenMarksheet + ", twelMarsksheet=" + twelMarsksheet + ", state="
				+ state + ", district=" + district + ", pincode=" + pincode + ", street=" + street + ", city=" + city
				+ "]";
	}
	
	
	

}
