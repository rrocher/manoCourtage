package com.mano.courtage.repo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mano.courtage.domain.ROLE;
import com.mano.courtage.domain.Role;
import com.mano.courtage.repo.RoleDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRoleDao {

	@Autowired
	RoleDao roleDao;

	
	@Test
	public void test1() {
		List<Role> roles = roleDao.findAll();
		assertNotNull(roles);
		assertFalse(roles.isEmpty());
	}
	@Test
	public void test2() {
		Role role = roleDao.findByCode(ROLE.ROLE_USER);
		assertNotNull(role);
	}
}
