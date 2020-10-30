package com.hcl.studentexamination.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;



/**
 * @author dudduguntaaji.reddy
 *
 */
public class User {
	private int id;
	@Range(max=12)
	private String aadhaarNumber;
	@NotEmpty
	private String name;
	@Pattern(regexp="^[a-zA-Z0-9] {3}@ ^[a-zA-Z0-9] {3}.com",message="Invalid Email Id.")
	private String emailId;
	@Pattern(regexp="^[0-9] {10}",message="Invalid mobile number.")
	private String mobileNumber;
	@NotEmpty
	private String password;
	@NotEmpty
	private String confirmPassword;
	@Range(min=1)
	private int roleId;

	public User() {
		super();
	}

	public User(int id, String aadhaarNumber, String name, String mobileNumber, String password, String confirmPassword, int roleId) {
		super();
		this.id = id;
		this.aadhaarNumber = aadhaarNumber;
		this.name=name;
		this.mobileNumber=mobileNumber;
		this.password = password;
		this.confirmPassword=confirmPassword;
		this.roleId = roleId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}
	
	public String getEmail() {
		return emailId;
	}

	public void setEmail(String emailId) {
		this.emailId=emailId;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber=mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	/*
	public String getConfirmPassword() {
		return password;
	}

	public void setConfirmPassword(String confrimPassword) {
		this.confirmPassword = confirmPassword;
	}
	*/

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

}
