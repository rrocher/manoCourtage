package com.mano.courtage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.LoanInterestRatePayment;
import com.mano.courtage.domain.LoanPsblAmountPayment;
import com.mano.courtage.domain.LoanPsblPayment;

@Repository
public interface LoanPsblAmountPaymentDao extends JpaRepository<LoanPsblAmountPayment, Integer> {
	
	LoanPsblAmountPayment findByLoanInterestRatePaymentAndLoanPsblPayment(LoanInterestRatePayment irp, LoanPsblPayment pp);
}
