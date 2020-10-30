package com.hcl.studentexamination.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "STATUS")
public class Status {
	@Column
	private String id;
	@Column
	private String status;

	public Status() {
		super();
	}

	public String getId() {
		return id;
	}
}
