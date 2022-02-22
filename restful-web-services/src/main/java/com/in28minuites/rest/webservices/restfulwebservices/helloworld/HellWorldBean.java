package com.in28minuites.rest.webservices.restfulwebservices.helloworld;

public class HellWorldBean {
	
	private String message;

	public HellWorldBean(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HellWorldBean [message= %s]",message);
	}
	

}
