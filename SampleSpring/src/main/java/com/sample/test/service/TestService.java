package com.sample.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.test.dao.TestDAO;

@Service("testService")
public class TestService {

	@Autowired
	private TestDAO testDao;

	public String serviceMethod() {
		System.out.println("** in side service method **");
		return testDao.daoMethod();
	}

}