package com.mano.courtage.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.Loan;
import com.mano.courtage.domain.User;

@Repository
public interface LoanDao extends JpaRepository<Loan, Integer>{

	public List<Loan> findByLoaner(User user);
	public Loan findByLoanerAndId(User user, int id);
	public List<Loan> findByApprover(User user);
	public List<Loan> findByIdUserInsert(User user);
}
