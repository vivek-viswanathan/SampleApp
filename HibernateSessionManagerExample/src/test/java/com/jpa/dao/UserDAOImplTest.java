package com.jpa.dao;

import org.junit.Test;

public class UserDAOImplTest {

	@Test
	public void testFetchApplicationUser() {
		UserDAO userDao = new UserDAOImpl();
		System.out.println("Hello " + userDao.fetchApplicationUser(3).getUserFirstName());
	}

}
