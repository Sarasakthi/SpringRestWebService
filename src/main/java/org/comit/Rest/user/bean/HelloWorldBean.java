package org.comit.Rest.user.bean;

public class HelloWorldBean {
	
	public String message;
	public String name;
	public int id;
	
	public HelloWorldBean() {
		super();
	}

	public HelloWorldBean(String message, String name, int id) {
		super();
		this.message = message;
		this.name = name;
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

	}
