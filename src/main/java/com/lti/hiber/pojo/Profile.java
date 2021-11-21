package com.lti.hiber.pojo;
//entity class//pojo
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;



@Entity
@Table(name="personaldetails")
public class Profile {
	@Id
	@Column(name="identityno")
	private int idno;
	@Column(name="firstname")
    private String firstName;
	//column name not given..will take the name of the variable
    private String lastName;
    @Column(name="personcity")
    private String city;
    
    
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Profile [idno=" + idno + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
	}

	public Profile(int idno, String firstname, String lastname, String city) {
		super();
		this.idno = idno;
		this.firstName = firstname;
		this.lastName = lastname;
		this.city = city;
	}
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	public String getFirstname() {
		return firstName;
	}
	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}
	public String getLastname() {
		return lastName;
	}
	public void setLastname(String lastname) {
		this.lastName = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    

}
