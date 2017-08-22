package com.mano.courtage.repo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mano.courtage.domain.User;
import com.mano.courtage.repo.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserDao {

	@Autowired
	UserDao userDao;

	
	@Test
	public void test1() {
		List<User> users = userDao.findAll();
		assertNotNull(users);
		assertNotNull(users.get(0).getRoles());
		assertFalse(users.get(0).getRoles().isEmpty());
		assertFalse(users.isEmpty());
	}
	
}
