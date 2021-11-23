package com.lti.hiber.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person111")
public class Person
{
	@Id
	@Column(name="idcardno")
	private int idNo;
	private String firstName;
	private String state;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="passportNo",referencedColumnName = "passportNo")
	//@JoinColumn(name="aadharno",referencedColumnName="aadharNo")
	//@JoinTable(name="personadharinfo222",joinColumns= {
	//		@JoinColumn(name="idcardno",referencedColumnName="idcardno")
	//},
	//inverseJoinColumns= {
	//		@JoinColumn(name="aadharno",referencedColumnName="aadharNo")
	//})
	
	
	/*private PersonAadhar pAadhr;
	
	public PersonAadhar getpAadhr() {
		return pAadhr;
	}
	
	public void setpAadhr(PersonAadhar pAadhr) {
		this.pAadhr = pAadhr;
	}*/
	private Passport pPassport;
	
	
	public Passport getpPassport() {
		return pPassport;
	}
	public void setpPassport(Passport pPassport) {
		this.pPassport = pPassport;
	}
	public Person() {
		super();
	}
	public Person(int idNo, String firstName, String state) {
		super();
		this.idNo = idNo;
		this.firstName = firstName;
		this.state = state;
	}
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
