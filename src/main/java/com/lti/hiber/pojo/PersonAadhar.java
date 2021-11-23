package com.lti.hiber.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="personaadhar111")
public class PersonAadhar
{
	@Id
	private String aadharNo;
	private LocalDate dateOfIssue;
	
	/*@OneToOne(mappedBy="pAadhr")
	private Person person;*/
	
	public PersonAadhar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonAadhar(String aadharNo, LocalDate dateOfIssue) {
		super();
		this.aadharNo = aadharNo;
		this.dateOfIssue = dateOfIssue;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public LocalDate getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(LocalDate dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	
}
