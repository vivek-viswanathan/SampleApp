package com.jpa.dao;

import java.sql.Timestamp;
import java.util.Calendar;

import org.junit.Test;

import com.jpa.core.ApplicationUser;

public class UserDAOImplTest {

	@Test
	public void testSaveApplicationUser() {
		UserDAO userDao = new UserDAOImpl();
		userDao.saveApplicationUser(getApplicationUser());
	}

	private static ApplicationUser getApplicationUser() {
		ApplicationUser appUser = new ApplicationUser();
		appUser.setUserFirstName("Vivek");
		appUser.setUserLastName("Viswanathan");
		appUser.setAge(29);
		appUser.setCreatedBy(1);
		appUser.setCreatedDate(getTodaysDateandTime());
		appUser.setLastModifiedBy(1);
		appUser.setLastModifiedDate(getTodaysDateandTime());
		return appUser;
	}

	private static Timestamp getTodaysDateandTime() {
		Calendar now = Calendar.getInstance();
		return new Timestamp(now.getTime().getTime());
	}

}
