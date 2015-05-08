package com.koreinfotech.sms.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.koreinfotech.sms.domain.User;

/**
 * @author Archana
 *
 */
@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByName(String userName) {
		
		List<User> users = new ArrayList<User>();
		
		users = sessionFactory.getCurrentSession()
				.createQuery("from User where userName = :username")
				.setParameter("username", userName)
				.list();
		
		if(users.size() > 0)
			return users.get(0);
		else
			return null;
	
	}

}
