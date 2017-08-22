package com.mano.courtage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>  {
	
	public User findByFirstNameAndLastName(String firstName, String lastName);
	public User findByEmail(String email);

}
