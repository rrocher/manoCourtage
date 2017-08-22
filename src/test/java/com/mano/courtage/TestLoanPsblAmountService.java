package com.mano.courtage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.mano.courtage.domain.LoanPsblAmount;
import com.mano.courtage.domain.LoanPsblAmountPayment;
import com.mano.courtage.domain.LoanPsblDuration;
import com.mano.courtage.domain.LoanPsblPayment;
import com.mano.courtage.server.LoanUtilsController;
import com.mano.courtage.server.utils.NotFoundException;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TestLoanPsblAmountService {
	@Autowired
	LoanUtilsController loanUtilsController;
	
	@Test
	public void test1() {
		List<LoanPsblAmount> loanAmounts = loanUtilsController.getLoanAmounts();
		assertNotNull(loanAmounts);
		assertFalse(loanAmounts.isEmpty());
		assertTrue(loanAmounts.stream().allMatch((loanAmount)->{return loanAmount != null;}));
		
	}

	@Test
	public void test3() throws JsonProcessingException {
		List<LoanPsblAmount> loanAmounts = loanUtilsController.getLoanAmounts();
		assertNotNull(loanAmounts);
		assertFalse(loanAmounts.isEmpty());
		assertTrue(loanAmounts.stream().allMatch((loanAmount)->{return loanAmount != null;}));
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(loanAmounts);
		System.out.println(json);
		
	}

	@Test
	public void test4() throws JsonProcessingException {
		List<LoanPsblDuration> data = loanUtilsController.getloanDurations();
		assertNotNull(data);
		assertFalse(data.isEmpty());
		assertTrue(data.stream().allMatch((l)->{return l != null;}));
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(data);
		System.out.println(json);
		
	}

	@Test
	public void test5() throws JsonProcessingException {
		List<LoanPsblPayment> data = loanUtilsController.getloanPayments();
		assertNotNull(data);
		assertFalse(data.isEmpty());
		assertTrue(data.stream().allMatch((l)->{return l != null;}));
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(data);
		System.out.println(json);
		
	}

	@Test
	public void test6() throws JsonProcessingException {
		List<LoanPsblAmountPayment> data = loanUtilsController.getloanAmountPayments();
		assertNotNull(data);
		assertFalse(data.isEmpty());
		assertTrue(data.stream().allMatch((l)->{return l != null;}));
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(data);
		System.out.println(json);
		
	}
	
	

	@Test(expected=NotFoundException.class)
	public void test2() {
		LoanPsblAmount loanAmount = loanUtilsController.getLoanAmount(0);
	}
}
