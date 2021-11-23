package com.lti.hiber.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personpassport")
public class Passport
{
	@Id
	private String passportNo;
	private String fullName;
	private int validityinMonths;
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(String passportNo, String fullName, int validityinMonths) {
		super();
		this.passportNo = passportNo;
		this.fullName = fullName;
		this.validityinMonths = validityinMonths;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getValidityinMonths() {
		return validityinMonths;
	}
	public void setValidityinMonths(int validityinMonths) {
		this.validityinMonths = validityinMonths;
	}
	
}
