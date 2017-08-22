package com.mano.courtage.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.mano.courtage.config.JwtUser;
import com.mano.courtage.domain.Loan;
import com.mano.courtage.domain.LoanInterestRatePayment;
import com.mano.courtage.domain.LoanPsblAmount;
import com.mano.courtage.domain.LoanPsblAmountPayment;
import com.mano.courtage.domain.LoanPsblPayment;
import com.mano.courtage.domain.ROLE;
import com.mano.courtage.domain.STATE;
import com.mano.courtage.domain.User;
import com.mano.courtage.domain.UserWork;
import com.mano.courtage.dto.LoanDTO;
import com.mano.courtage.dto.UserDTO;
import com.mano.courtage.dto.UserWorkDTO;
import com.mano.courtage.repo.LoanDao;
import com.mano.courtage.repo.LoanInterestRatePaymentDao;
import com.mano.courtage.repo.LoanPsblAmountDao;
import com.mano.courtage.repo.LoanPsblAmountPaymentDao;
import com.mano.courtage.repo.RoleDao;
import com.mano.courtage.repo.UserDao;
import com.mano.courtage.service.utils.UserExistsException;

@Service
public class LoanService implements IService<Loan>{

	@Autowired
	LoanDao loanDao;
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	RoleDao roleDao;
	
	@Autowired
	LoanPsblAmountDao loanAmountDao;
	
	@Autowired
	LoanPsblAmountDao loanPsblAmountDao;
	
	@Autowired
	LoanPsblAmountPaymentDao loanPsblAmountPaymentDao;
	
	@Autowired
	LoanInterestRatePaymentDao loanInterestRatePaymentDao;
	
	@Inject
	UserService userService;
	@Inject
	UserWorkService userWorkService;
	
	@Override
	public Loan create(Loan t) throws Exception {
		// TODO Auto-generated method stub
		return loanDao.save(t);
	}

	@Override
	public boolean deleteIfPossible(Loan t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Loan find(Loan t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Loan getLoan(int id) throws Exception {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User user = null;
		if (authentication.getPrincipal().equals("anonymousUser"))
		{
			throw new Exception("User does not exist");
		}
		else
		{
			JwtUser aud = (JwtUser) authentication.getPrincipal();
			if (aud == null || aud.getUsername() == null)
				throw new Exception("User does not exist");
			user = (User) aud.getUser();
		}
		// TODO Auto-generated method stub
		return loanDao.findByLoanerAndId(user, id);
	}
	
	@Override
	public Loan validateNew(Loan t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> getAll() throws Exception {
		// TODO Auto-generated method stub
		return loanDao.findAll();
	}
	

	public Loan convertDtoToDomain(LoanDTO loanDto) throws Exception {
		
		Loan loan = new Loan();
		UserDTO userDto = loanDto.getLoaner();
		User user = userDao.findByEmail(userDto.getEmail());
		// Create user if need
		if (user != null)
			throw new UserExistsException(userDto.getEmail());
		user = userService.convertDtoToDomain(userDto);
		UserWorkDTO userWorkDto = loanDto.getWork();
		UserWork userWork = userWorkService.convertDtoToDomain(userWorkDto, user);
		userWork.setUser(user);
		user.addUserWork(userWork);
		user.addRole(roleDao.findByCode(ROLE.ROLE_USER));
		user = userService.create(user);
		
		LoanInterestRatePayment irp = loanInterestRatePaymentDao.
				findByLoanPsblAmountAndLoanPsblDuration(loanDto.getLoanPsblAmount(), loanDto.getLoanPsblDuration());
		LoanPsblAmountPayment pap = loanPsblAmountPaymentDao.
									findByLoanInterestRatePaymentAndLoanPsblPayment(irp, loanDto.getLoanPsblPayment());
		
		loan.setLoanPsblAmountPayment(pap);
		loan.setLoaner(user);
		loan.setIdUserInsert(user);
		loan.setIdUserUpdate(user);
		loan.setState(STATE.REVIEW_PENDING);
		loan.setStateDetails(STATE.REVIEW_PENDING.toString());
		loan.setComments(loanDto.getComments());
		return loan;
	}

}
