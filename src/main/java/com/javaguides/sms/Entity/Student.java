package com.javaguides.sms.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLong;
	
	@Column(name="first_name" , nullable = false)
	private String firstnameString;
	
	@Column(name="last_name" , nullable = false)
	private String lastnameString;
	
	@Column(name="email")
	private String emailString;

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [idLong=" + idLong + ", firstnameString=" + firstnameString + ", lastnameString="
				+ lastnameString + ", emailString=" + emailString + "]";
	}

	

	public Student(String firstnameString, String lastnameString, String emailString) {
		super();
		this.firstnameString = firstnameString;
		this.lastnameString = lastnameString;
		this.emailString = emailString;
	}

	public Long getIdLong() {
		return idLong;
	}

	public void setIdLong(Long idLong) {
		this.idLong = idLong;
	}

	public String getFirstnameString() {
		return firstnameString;
	}

	public void setFirstnameString(String firstnameString) {
		this.firstnameString = firstnameString;
	}

	public String getLastnameString() {
		return lastnameString;
	}

	public void setLastnameString(String lastnameString) {
		this.lastnameString = lastnameString;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

}
