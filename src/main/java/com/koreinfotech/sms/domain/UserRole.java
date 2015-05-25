package com.koreinfotech.sms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_ROLES")
public class UserRole {
	
	@Id
	@Column(name="USER_ROLE_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userRoleId;
	
	@ManyToOne
	@JoinColumn(name="USER_ID",nullable=false)
	private User user;
	
	@Column(name="ROLE",nullable=false)
	private String role;
	
	public UserRole() {
		super();
	}

	public UserRole(String role) {
		super();
		this.role = role;
	}

	public Long getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}
