package com.mano.courtage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.LoanType;
import com.mano.courtage.domain.LoanType.CODE;

@Repository
public interface LoanTypeDao extends JpaRepository<LoanType, Integer>{
	LoanType findByCode(CODE code);

}
