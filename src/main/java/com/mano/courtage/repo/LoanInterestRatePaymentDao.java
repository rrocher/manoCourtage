package com.mano.courtage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.LoanInterestRatePayment;
import com.mano.courtage.domain.LoanPsblAmount;
import com.mano.courtage.domain.LoanPsblDuration;

@Repository
public interface LoanInterestRatePaymentDao extends JpaRepository<LoanInterestRatePayment, Integer> {
	LoanInterestRatePayment findByLoanPsblAmountAndLoanPsblDuration(LoanPsblAmount pa, LoanPsblDuration pd);
   
}
