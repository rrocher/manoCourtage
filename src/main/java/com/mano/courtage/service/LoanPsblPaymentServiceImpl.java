package com.mano.courtage.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mano.courtage.domain.LoanPsblPayment;
import com.mano.courtage.repo.LoanPsblPaymentDao;

@Service
public class LoanPsblPaymentServiceImpl implements LoanPsblPaymentService{

	@Inject
	LoanPsblPaymentDao dao;
	
	@Override
	public LoanPsblPayment create(LoanPsblPayment t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteIfPossible(LoanPsblPayment t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LoanPsblPayment find(LoanPsblPayment t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanPsblPayment validateNew(LoanPsblPayment t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanPsblPayment> getAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
