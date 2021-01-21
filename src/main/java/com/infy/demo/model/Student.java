package com.infy.demo.model;

public class Student {

	private String id;
	private String name;
	private String std;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getName()=" + getName() + ", getStd()=" + getStd() + "]";
	}

}
