package com.sapient.hibernate;

public class Social {

	int id;
	String socialId;
	public Social(String name) {
		this.socialId = name;
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsocialId() {
		return socialId;
	}
	public void setSocialId(String socialId) {
		this.socialId = socialId;
	}
}