package com.mano.courtage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.Role;
import com.mano.courtage.domain.ROLE;

@Repository
public interface RoleDao  extends JpaRepository<Role, Integer>{
	public Role findByCode(ROLE code);

}
