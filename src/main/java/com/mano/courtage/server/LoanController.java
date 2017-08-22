package com.mano.courtage.server;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.websocket.server.PathParam;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.mano.courtage.domain.Loan;
import com.mano.courtage.domain.User;
import com.mano.courtage.dto.LoanDTO;
import com.mano.courtage.dto.UserDTO;
import com.mano.courtage.repo.LoanDao;
import com.mano.courtage.repo.LoanPsblPaymentDao;
import com.mano.courtage.repo.UserDao;
import com.mano.courtage.service.LoanPsblPaymentService;
import com.mano.courtage.service.LoanService;
import com.mano.courtage.service.UserService;

@RestController
@RequestMapping()
public class LoanController {

	@Inject
	LoanDao loanDao;
	
	@Inject
	UserDao userDao;

	@Inject
	LoanService loanService;

	@Inject
	UserService userService;

	public Loan getLoan() {
		return null;

	}

	public List<Loan> getLoans() {
		return null;

	}
	@RequestMapping(path="/me/v1/loan/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public ResponseEntity<Loan>  getLoan(@PathVariable("id") int id) throws Exception {

		Loan loan = loanService.getLoan(id);
		ResponseEntity<Loan> responseEntity = new ResponseEntity<Loan>(loan,  HttpStatus.OK);
		return responseEntity;
	}
	
	@RequestMapping(path="/unauth/v1/loan", method = RequestMethod.POST, consumes = "application/json;charset=UTF-8", produces = "application/json;charset=UTF-8")
	public ResponseEntity<Loan> postLoan(@RequestBody LoanDTO loanDto, UriComponentsBuilder ucb) throws Exception {
		// Get loan if valid from dto
		Loan loan = loanService.convertDtoToDomain(loanDto);
		
		loan = loanService.create(loan);
		HttpHeaders hdrs = new HttpHeaders();
		URI locationUri = ucb.path("/me/v1/loan/").path(String.valueOf(loan.getId())).build().toUri();
		hdrs.setLocation(locationUri);
		ResponseEntity<Loan> responseEntity = new ResponseEntity<Loan>(loan, hdrs, HttpStatus.CREATED);
		return responseEntity;
	}

}
