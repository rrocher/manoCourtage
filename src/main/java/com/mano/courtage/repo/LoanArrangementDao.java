package com.mano.courtage.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mano.courtage.domain.LoanArrangement;


@Repository
public interface LoanArrangementDao  extends JpaRepository<LoanArrangement, Integer>{

}
