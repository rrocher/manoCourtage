package com.mano.courtage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.LoanPsblAmount;

@Repository
public interface LoanPsblAmountDao  extends JpaRepository<LoanPsblAmount, Integer>{

}
