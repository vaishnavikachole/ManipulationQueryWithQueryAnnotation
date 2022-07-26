package com.jpa.person.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.person.dao.PersonDao;

@Service
public class PersonService {

	@Autowired
	PersonDao personDao;

	public void updateEmailById(int id,String newEmail)
	{
		personDao.updateEmailById(id,newEmail);
		
	}
	public void deletePersonById(int id)
	{
		personDao.deletePersonById(id);
	}

}
