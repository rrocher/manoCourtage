package com.mano.courtage.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.LoanPsblPayment;

@Repository
public interface LoanPsblPaymentDao extends JpaRepository<LoanPsblPayment, Integer> {
	
}
