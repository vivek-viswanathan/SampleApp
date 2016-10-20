package com.sample.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.spring.dao.SampleDAO;
import com.sample.spring.service.SampleService;

@Service("sampleService")
public class SampleServiceImpl extends SampleService {

	@Autowired
	private SampleDAO sampleDao;

	public String serviceMethod() {
		System.out.println("** in side service method **");
		return sampleDao.daoMethod();
	}

}