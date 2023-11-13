package com.userCrud.userCrud.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="firstname")
	private String firstName;

	@Column(name="lastname")
	private String lastName;
	
	@Column(name="dob")
	private String dob;
	
	@Column(name="address")
	private String address;
	
	
	public User() {
		super();
	}
	public User(String firstName, String lastName, String dob, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getDbo() {
		return dob;
	}
	public void setDbo(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
