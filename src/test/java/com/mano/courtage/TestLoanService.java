package com.mano.courtage;

import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.mano.courtage.domain.Loan;
import com.mano.courtage.domain.User;
import com.mano.courtage.repo.LoanDao;
import com.mano.courtage.repo.LoanPsblAmountDao;
import com.mano.courtage.repo.LoanPsblPaymentDao;
import com.mano.courtage.repo.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TestLoanService {
	@Autowired
	UserDao userDao;
	

	@Autowired
	LoanPsblAmountDao loanAmountDao;

	@Autowired
	LoanDao loanDao;

	@Autowired
	LoanPsblPaymentDao loanPsblPayment;
	
	@Test
	public void test1() {
		User user = userDao.findByFirstNameAndLastName("Rimte", "Rocher");
		Loan loan = new Loan();
		loan.setApprover(user);
		loan.setComments("test");
		loan.setLoaner(user);
		loan.setIdUserInsert(user);
		loan.setIdUserUpdate(user);
		loanDao.save(loan);
	}
	

	@Test
	public void test2() throws JsonProcessingException {
		User user = userDao.findByFirstNameAndLastName("Rimte", "Rocher");
		Loan loan = new Loan();
		loan.setApprover(user);
		loan.setComments("test");
		loan.setLoaner(user);
		loan.setIdUserInsert(user);
		loan.setIdUserUpdate(user);
		loanDao.save(loan);
		Loan test= loanDao.findAll().get(0);
		assertNotNull(test);
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(test);
		assertNotNull(test);
		System.out.println(json);
	}

}
