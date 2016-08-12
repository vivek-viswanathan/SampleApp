package com.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.core.ApplicationUser;

public class UserDAOImpl extends UserDAO {

	@Override
	public void saveApplicationUser(ApplicationUser appUser) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test-JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(appUser);
		em.getTransaction().commit();
	}
}
