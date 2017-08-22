package com.mano.courtage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mano.courtage.domain.LoanInterestRatePayment;
import com.mano.courtage.repo.LoanInterestRatePaymentDao;

@Service
public class LoanInterestPaymentServiceImpl implements LoanInterestRatePaymentService {

	@Autowired
	LoanInterestRatePaymentDao dao;

	@Override
	public LoanInterestRatePayment create(LoanInterestRatePayment t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteIfPossible(LoanInterestRatePayment t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LoanInterestRatePayment find(LoanInterestRatePayment t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoanInterestRatePayment validateNew(LoanInterestRatePayment t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanInterestRatePayment> getAll() throws Exception {
		return dao.findAll();
	}

}
