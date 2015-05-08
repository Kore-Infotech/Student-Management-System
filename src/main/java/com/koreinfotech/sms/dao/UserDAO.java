package com.koreinfotech.sms.dao;

import java.util.List;

import com.koreinfotech.sms.domain.User;

public interface UserDAO {
	
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(Long userId);
	public List<User> listAllUsers();
	public User findUserByName(String userName);

}
