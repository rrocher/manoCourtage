package com.mano.courtage.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mano.courtage.domain.LoanType;
import com.mano.courtage.repo.LoanTypeDao;

@Service
public class LoanTypeServiceImpl implements LoanTypeService {

	@Inject
	LoanTypeDao dao;

	@Override
	public LoanType create(LoanType t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteIfPossible(LoanType t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LoanType find(LoanType t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanType validateNew(LoanType t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanType> getAll() throws Exception {
		return dao.findAll();
	}

}
