package com.koreinfotech.sms.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.koreinfotech.sms.dao.UserDAO;
import com.koreinfotech.sms.domain.User;
import com.koreinfotech.sms.domain.UserRole;

@Service("userService")
public class UserServiceImpl implements UserDetailsService,UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDAO userDAO;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		
		logger.info("Inside UserServiceImpl - loadUserByUsername");
		
		if(userName == null )
			throw new UsernameNotFoundException("Username cannot be found");
		
		User user = userDAO.findUserByName(userName);
		if(user == null)
			throw new UsernameNotFoundException("Username cannot be found");
		
		return buildUserForAuthentication(user);
	}
	
	/**
	 * Convert from com.koreinfotech.sms.domain.User user to org.springframework.security.core.userdetails.User
	 * @param user
	 * @return
	 */
	private org.springframework.security.core.userdetails.User buildUserForAuthentication(com.koreinfotech.sms.domain.User user){
		
		return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),user.isEnabled(),true,true,true,buildUserAuthority(user.getUserRoles()));
		
	}
	/**
	 * Build user's authorities
	 * @return
	 */
	private List<GrantedAuthority> buildUserAuthority(List<UserRole> userRoles) {
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for(UserRole userRole : userRoles) {
			logger.info("User Role :" + userRole.getRole());
			authorities.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
		return authorities;
	}
	
	@Transactional
	public void addUser(User user) {
		
		//Adding role "ROLE_USER" by default for all users 
		
		user.addUserRole(new UserRole("ROLE_USER"));
		userDAO.addUser(user);
	}

}
