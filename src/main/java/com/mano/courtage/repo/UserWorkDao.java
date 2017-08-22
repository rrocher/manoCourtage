package com.mano.courtage.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mano.courtage.domain.User;
import com.mano.courtage.domain.UserWork;

public interface UserWorkDao  extends JpaRepository<UserWork, Integer>  {

}
