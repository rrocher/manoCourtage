package com.mano.courtage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mano.courtage.domain.LoanPsblDuration;
import com.mano.courtage.repo.LoanPsblDurationDao;

@Service
public class LoanPsblDurationServiceImpl implements LoanPsblDurationService {

	@Autowired
	LoanPsblDurationDao dao;

	@Override
	public LoanPsblDuration create(LoanPsblDuration t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteIfPossible(LoanPsblDuration t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LoanPsblDuration find(LoanPsblDuration t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanPsblDuration validateNew(LoanPsblDuration t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanPsblDuration> getAll() throws Exception {
		return dao.findAll();
	}

}
