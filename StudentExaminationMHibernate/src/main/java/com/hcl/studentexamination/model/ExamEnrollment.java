package com.hcl.studentexamination.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Exam")
public class ExamEnrollment {
	@Column
	private String userID;
	private String statusID;

	public ExamEnrollment() {
		super();
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getStatusID() {
		return statusID;
	}

	public void setStatusID(String statusID) {
		this.statusID = statusID;
	}

	@Override
	public String toString() {
		return "Job [userID=" + userID + " statusID=" + statusID + "]";
	}

}
