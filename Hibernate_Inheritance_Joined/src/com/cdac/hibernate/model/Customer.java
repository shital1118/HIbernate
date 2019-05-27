package com.cdac.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Customer1")
public class Customer extends Person{
	
	@Column(name="MOBILE_NO")
	private String mobileNo;

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Customer() {
		super();
	}

	public Customer(String mobileNo) {
		super();
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Customer [mobileNo=" + mobileNo + "]";
	}
	
	
}
