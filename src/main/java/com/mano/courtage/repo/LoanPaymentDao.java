package com.mano.courtage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.LoanPayment;

@Repository
public interface LoanPaymentDao extends JpaRepository<LoanPayment, Integer> {

}
