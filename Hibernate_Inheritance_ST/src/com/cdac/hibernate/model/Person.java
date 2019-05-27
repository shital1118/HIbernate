package com.cdac.hibernate.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

@Table(name="Person_ST")
public class Person {
	
	@Id
	@Column(name="PERSON_ID")
	private int pId;
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="LASTNAME")
	private String lastName;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Person() {
		super();
	}
	public Person(int pId, String firstName, String lastName) {
		super();
		this.pId = pId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	


}
