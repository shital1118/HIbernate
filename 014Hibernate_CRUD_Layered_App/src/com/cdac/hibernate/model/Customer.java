package com.cdac.hibernate.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CDAC_Customer")
public class Customer {
	@Id
	@Column(name="CUST_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	 private Integer custId;
	//@Column(name="CUST_NAME")
	 private String custName;
	 private String phone;
	 private String email;
	public Customer() {
		super();
	}
	public Customer(Integer custId, String custName, String phone, String email) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.phone = phone;
		this.email = email;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", phone=" + phone + ", email=" + email + "]";
	}

	 
	 
}
