package com.cdac.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="OnlineCustomer1")
public class OnlineCustomer extends Customer{
	
	@Column(name="EMAIL")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public OnlineCustomer() {
		super();
	}

	public OnlineCustomer(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return "OnlineCustomer [email=" + email + "]";
	}
	

}
