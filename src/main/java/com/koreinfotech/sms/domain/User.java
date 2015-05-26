package com.koreinfotech.sms.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Long userId;
	
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
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<UserRole> userRoles = new ArrayList<UserRole>();

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	@Override
	public String toString() {
		return "User [userID=" + userId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", userName="
				+ userName + ", password=" + password + ", enabled=" + enabled
				+ "]";
	}
	
	public void addUserRole(UserRole userRole){
		userRole.setUser(this);
		userRoles.add(userRole);
	}

}
