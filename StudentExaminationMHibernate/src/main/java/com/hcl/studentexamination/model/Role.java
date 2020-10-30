package com.hcl.studentexamination.model;

public class Role {
	private String rid;
	private String rname;

	public String getRid() {
		return rid;
	}

	public void setRid(String rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Role() {
		super();
	}

	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + "]";
	}
}
