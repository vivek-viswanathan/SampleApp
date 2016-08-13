package com.jpa.dao;

import org.hibernate.Session;

import com.jpa.core.ApplicationUser;

public class UserDAOImpl extends UserDAO {

	@Override
	public ApplicationUser fetchApplicationUser(int userIdentifier) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return (ApplicationUser)session.get(ApplicationUser.class, userIdentifier); 
	}
}
