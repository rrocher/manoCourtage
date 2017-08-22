package com.mano.courtage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mano.courtage.domain.LoanPsblAmount;
import com.mano.courtage.repo.LoanPsblAmountDao;

@Service
public class LoanPsblAmountServiceImpl implements LoanPsblAmountService{

	@Autowired
	LoanPsblAmountDao loanPsblAmountDao;
	
	@Override
	public LoanPsblAmount create(LoanPsblAmount t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanPsblAmount> getAll() throws Exception {
		// TODO Auto-generated method stub
		return loanPsblAmountDao.findAll();
	}
	
	@Override
	public boolean deleteIfPossible(LoanPsblAmount t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LoanPsblAmount find(LoanPsblAmount t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanPsblAmount validateNew(LoanPsblAmount t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
