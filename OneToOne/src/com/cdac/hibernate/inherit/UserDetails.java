package com.cdac.hibernate.inherit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserDetails {
	
	@Id
	@Column(name="USERID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	@Column(name="USERNAME")
	private String userName;
	
	@OneToOne
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public UserDetails() {
		super();
	}

	public UserDetails(int userId, String userName, Vehicle vehicle) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.vehicle = vehicle;
	}

	public UserDetails(String userName, Vehicle vehicle) {
		super();
		this.userName = userName;
		this.vehicle = vehicle;
	}
	
	
}
