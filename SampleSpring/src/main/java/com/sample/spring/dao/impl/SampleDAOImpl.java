package com.sample.spring.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.sample.spring.dao.SampleDAO;

@Repository("sampleDao")
public class SampleDAOImpl extends SampleDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("dataSource")
	public void setDataSource(DataSource argDataSource) {
		this.jdbcTemplate = new JdbcTemplate(argDataSource);
	}

	public String daoMethod() {
		System.out.println("** in side dao method **");
		System.out.println("** jdbc template: **" + jdbcTemplate);
		return "success";
	}

}
