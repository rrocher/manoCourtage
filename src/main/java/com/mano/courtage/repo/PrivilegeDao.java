package com.mano.courtage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.Privilege;

@Repository
public interface PrivilegeDao extends JpaRepository<Privilege, Integer> {

}
