package com.mano.courtage.server;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mano.courtage.domain.LoanPsblAmount;
import com.mano.courtage.domain.LoanPsblAmountPayment;
import com.mano.courtage.domain.LoanPsblDuration;
import com.mano.courtage.domain.LoanPsblPayment;
import com.mano.courtage.domain.LoanType;
import com.mano.courtage.repo.LoanInterestRatePaymentDao;
import com.mano.courtage.repo.LoanPsblAmountDao;
import com.mano.courtage.repo.LoanPsblAmountPaymentDao;
import com.mano.courtage.repo.LoanPsblDurationDao;
import com.mano.courtage.repo.LoanPsblPaymentDao;
import com.mano.courtage.repo.LoanTypeDao;
import com.mano.courtage.server.utils.NotFoundException;
import com.mano.courtage.service.LoanInterestRatePaymentService;
import com.mano.courtage.service.LoanPsblAmountPaymentService;
import com.mano.courtage.service.LoanPsblAmountService;
import com.mano.courtage.service.LoanPsblDurationService;
import com.mano.courtage.service.LoanPsblPaymentService;
import com.mano.courtage.service.LoanTypeService;

@RestController
@RequestMapping("/unauth/v1")
public class LoanUtilsController {

	@Inject
	LoanPsblPaymentDao loanPsblPaymentDao;
	
	@Inject
	LoanPsblAmountDao loanAmountDao;

	@Inject
	LoanPsblPaymentService loanPsblPaymentService;

	@Inject
	LoanPsblDurationService loanPsblDurationService;

	@Inject
	LoanTypeService loanTypeService;

	@Inject
	LoanPsblAmountPaymentService loanAmountPaymentService;

	@Inject
	LoanInterestRatePaymentService loanInterestPaymentService;

	@Inject
	LoanPsblAmountService loanAmountService;

	@Inject
	LoanTypeDao loanTypeDao;

	@Inject
	LoanPsblAmountPaymentDao loanAmountPaymentDao;

	@Inject
	LoanInterestRatePaymentDao loanInterestPaymentDao;

	@Inject
	LoanPsblDurationDao loanPsblDurationDao;

	
	

	@RequestMapping(value = "/loan-amount", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public List<LoanPsblAmount> getLoanAmounts() {

		List<LoanPsblAmount> loanPsblAmounts = null;
		try {
			loanPsblAmounts = loanAmountService.getAll();
			
		}catch(Exception e) {
			throw new NotFoundException();
		}
		if (loanPsblAmounts == null) 
			throw new NotFoundException();
		return loanPsblAmounts;
	}
	
	@RequestMapping(value = "/loan-amount/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public LoanPsblAmount getLoanAmount(@RequestParam int id) {

		LoanPsblAmount loanPsblAmount = null;
		try {
			loanPsblAmount = loanAmountDao.findOne(id);
			
		}catch(Exception e) {
			throw new NotFoundException(id);
		}
		if (loanPsblAmount == null) 
			throw new NotFoundException(id);
		return loanPsblAmount;
	}
	
	@RequestMapping(value = "/loan-payment", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public List<LoanPsblPayment> getloanPayments() {

		List<LoanPsblPayment> loanPsblPayments = null;
		try {
			loanPsblPayments = loanPsblPaymentService.getAll();
			
		}catch(Exception e) {
			throw new NotFoundException();
		}
		if (loanPsblPayments == null) 
			throw new NotFoundException();
		return loanPsblPayments;
	}
	
	@RequestMapping(value = "/loan-payment/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public LoanPsblPayment getloanPayment(@RequestParam int id) {

		LoanPsblPayment loanPsblPayment = null;
		try {
			loanPsblPayment = loanPsblPaymentDao.findOne(id);
			
		}catch(Exception e) {
			throw new NotFoundException(id);
		}
		if (loanPsblPayment == null) 
			throw new NotFoundException(id);
		return loanPsblPayment;
	}
	/*Loan Type*/
	@RequestMapping(value = "/loan-type", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public List<LoanType> getloanTypes() {

		List<LoanType> loanTypes = null;
		try {
			loanTypes = loanTypeService.getAll();
			
		}catch(Exception e) {
			throw new NotFoundException();
		}
		if (loanTypes == null) 
			throw new NotFoundException();
		return loanTypes;
	}
	
	@RequestMapping(value = "/loan-type/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public LoanType getloanType(@RequestParam int id) {

		LoanType loanType = null;
		try {
			loanType = loanTypeDao.findOne(id);
			
		}catch(Exception e) {
			throw new NotFoundException(id);
		}
		if (loanType == null) 
			throw new NotFoundException(id);
		return loanType;
	}

	/*Loan Duration*/
	@RequestMapping(value = "/loan-duration", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public List<LoanPsblDuration> getloanDurations() {

		List<LoanPsblDuration> data = null;
		try {
			data = loanPsblDurationService.getAll();
			
		}catch(Exception e) {
			throw new NotFoundException();
		}
		if (data == null) 
			throw new NotFoundException();
		return data;
	}
	
	@RequestMapping(value = "/loan-duration/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public LoanPsblDuration getloanDuration(@RequestParam int id) {

		LoanPsblDuration data = null;
		try {
			data = loanPsblDurationDao.findOne(id);
			
		}catch(Exception e) {
			throw new NotFoundException(id);
		}
		if (data == null) 
			throw new NotFoundException(id);
		return data;
	}

	/*Loan Amount Payment*/
	@RequestMapping(value = "/loan-amount-payment", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public List<LoanPsblAmountPayment> getloanAmountPayments() {

		List<LoanPsblAmountPayment> data = null;
		try {
			data = loanAmountPaymentService.getAll();
			
		}catch(Exception e) {
			throw new NotFoundException();
		}
		if (data == null) 
			throw new NotFoundException();
		return data;
	}
	
	@RequestMapping(value = "/loan-amount-payment/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public LoanPsblAmountPayment getloanAmountPayment(@RequestParam int id) {

		LoanPsblAmountPayment data = null;
		try {
			data = loanAmountPaymentDao.findOne(id);
			
		}catch(Exception e) {
			throw new NotFoundException(id);
		}
		if (data == null) 
			throw new NotFoundException(id);
		return data;
	}
	
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Error dataNotFound(NotFoundException e) {
	  long id = e.getId();
	  Error error ;
	  if (id != 0)
		  error = new Error("Data Requested with id [" + id + "] not found");
	  else
		  error = new Error("Data Requested not found");
	  return error;
	}

}
