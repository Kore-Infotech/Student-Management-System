package com.koreinfotech.sms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Long userID;
	
	@NotBlank
	@Column(name="FIRST_NAME",nullable=false)
	private String firstName;
	
	@NotBlank
	@Column(name="LAST_NAME",nullable=false)
	private String lastName;
	
	@NotBlank
	@Column(name="EMAIL",nullable=false)
	@Email
	private String email;
	
	@NotBlank
	@Column(name="USER_NAME",nullable=false)
	private String userName;
	
	@NotBlank
	@Column(name="PASSWORD",nullable=false)
	private String password;
	
	@Column(name="ENABLED",nullable=false)
	private boolean enabled = true;

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", userName="
				+ userName + ", password=" + password + ", enabled=" + enabled
				+ "]";
	}

}
