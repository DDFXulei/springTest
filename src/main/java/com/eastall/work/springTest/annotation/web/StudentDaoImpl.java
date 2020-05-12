package com.eastall.work.springTest.annotation.web;

import org.springframework.stereotype.Repository;

@Repository("studentDaoId")
public class StudentDaoImpl implements StudentDao {

	@Override
	public void save() {

		System.out.println("dao");
	}

}
