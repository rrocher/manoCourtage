package com.mano.courtage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mano.courtage.domain.LoanPsblAmountPayment;
import com.mano.courtage.repo.LoanPsblAmountPaymentDao;

@Service
public class LoanPsblAmountPaymentServiceImpl implements LoanPsblAmountPaymentService {

	@Autowired
	LoanPsblAmountPaymentDao dao;
	@Override
	public LoanPsblAmountPayment create(LoanPsblAmountPayment t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteIfPossible(LoanPsblAmountPayment t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LoanPsblAmountPayment find(LoanPsblAmountPayment t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanPsblAmountPayment validateNew(LoanPsblAmountPayment t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanPsblAmountPayment> getAll() throws Exception {
		return dao.findAll();
	}

}
