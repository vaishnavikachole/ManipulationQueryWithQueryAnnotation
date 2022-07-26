package com.jpa.person.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.person.entities.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer>
{
	@Transactional
	@Modifying
	@Query("UPDATE Person set email=:newEmail1 WHERE id=:personId")
    void updateEmailById(@Param("personId") int id,@Param("newEmail1") String newEmail);
	
	@Transactional
	@Modifying
	@Query("DELETE from Person Where id=:personId")
	void deletePersonById(@Param("personId") int id);

}
