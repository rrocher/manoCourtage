package com.mano.courtage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.LoanPsblDuration;

@Repository
public interface LoanPsblDurationDao extends JpaRepository<LoanPsblDuration, Integer>  {

}
