package com.mano.courtage;

import static org.junit.Assert.*;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mobile.device.Device;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.mano.courtage.config.JwtAuthenticationRequest;
import com.mano.courtage.config.JwtTokenUtil;
import com.mano.courtage.domain.LoanPsblAmount;
import com.mano.courtage.domain.LoanPsblDuration;
import com.mano.courtage.domain.LoanPsblPayment;
import com.mano.courtage.domain.LoanType;
import com.mano.courtage.domain.LoanType.CODE;
import com.mano.courtage.dto.LoanDTO;
import com.mano.courtage.dto.UserDTO;
import com.mano.courtage.dto.UserWorkDTO;
import com.mano.courtage.repo.LoanDao;
import com.mano.courtage.repo.LoanPsblAmountDao;
import com.mano.courtage.repo.LoanPsblDurationDao;
import com.mano.courtage.repo.LoanPsblPaymentDao;
import com.mano.courtage.repo.LoanTypeDao;

public class TestLoanServer extends BaseTestServer {

	@Autowired
	LoanPsblAmountDao loanAmountDao;

	@Autowired
	LoanDao loanDao;

	@Autowired
	LoanPsblPaymentDao loanPsblPaymentDao;

	@Autowired
	LoanPsblDurationDao loanPsblDurationDao;

	@Autowired
	LoanTypeDao loanTypeDao;

	String url = null;
	private MockMvc mvc;

	@Autowired
	private WebApplicationContext context;

	@Before
	public void setup() {
		mvc = MockMvcBuilders.webAppContextSetup(context).apply(springSecurity()).build();
	}

	@Test
	public void addLoan() {

		LoanPsblAmount loanPsblAmount = loanAmountDao.findAll().get(0);
		UserDTO loaner = new UserDTO("test", "test", "test", "test", "test", "test", "test", "test");
		UserWorkDTO work = new UserWorkDTO("test", "test", "test", "test", "test", "test");
		LoanPsblPayment loanPsblPayment = loanPsblPaymentDao.findAll().get(0);
		LoanPsblDuration loanPsblDuration = loanPsblDurationDao.findAll().get(0);
		String comments = "test";
		LoanType type = loanTypeDao.findByCode(CODE.STEP_BY_STEP);
		LoanDTO loanDto = new LoanDTO.Builder(type, loaner, work).loanPsblAmount(loanPsblAmount).loanPsblPayment(loanPsblPayment).
				loanPsblDuration(loanPsblDuration).comments(comments).build();

		HttpEntity<LoanDTO> entity = new HttpEntity<LoanDTO>(loanDto, headers);

		ResponseEntity<String> response = restTemplate.exchange(createURLWithPort("/unauth/v1/loan"), HttpMethod.POST,
				entity, String.class);

		url = response.getHeaders().get(HttpHeaders.LOCATION).get(0);

		System.out.println(url);
		// assertTrue(actual.contains("/students/Student1/courses/"));

	}

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;
	@After
	public void getLoan() {

        // Reload password post-security so we can generate token
        final UserDetails userDetails = userDetailsService.loadUserByUsername("test");
        final String token = jwtTokenUtil.generateTokenWithoutDevice(userDetails);
		headers.add("Authorization", "Bearer " + token);
		HttpEntity<LoanDTO> entity = new HttpEntity<LoanDTO>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity,
				String.class);
		System.out.println(response.getBody());
		assertTrue(response.getStatusCode() == HttpStatus.OK);

	}

}
