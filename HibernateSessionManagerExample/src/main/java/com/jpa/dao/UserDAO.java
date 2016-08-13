package com.jpa.dao;

import com.jpa.core.ApplicationUser;

public abstract class UserDAO {

	public abstract ApplicationUser fetchApplicationUser(int userIdentifier);
}
