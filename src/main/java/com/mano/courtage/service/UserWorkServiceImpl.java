package com.mano.courtage.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mano.courtage.domain.User;
import com.mano.courtage.domain.UserWork;
import com.mano.courtage.dto.UserDTO;
import com.mano.courtage.dto.UserWorkDTO;
import com.mano.courtage.repo.UserWorkDao;

@Service
public class UserWorkServiceImpl implements UserWorkService{

	@Inject
	UserWorkDao userWorkDao;
	
	@Override
	public UserWork create(UserWork t) throws Exception {
		// TODO Auto-generated method stub
		return userWorkDao.save(t);
	}

	@Override
	public boolean deleteIfPossible(UserWork t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserWork find(UserWork t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserWork validateNew(UserWork t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserWork> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserWork convertDtoToDomain(UserWorkDTO userDto, User user) {
		UserWork uw = new UserWork();
		uw.setAddress(userDto.getAddress());
		uw.setCompany(userDto.getCompany());
		uw.setPhone(userDto.getPhone());
		uw.setSupervisor(userDto.getSupervisor());
		uw.setSupervisorPhone(userDto.getSupervisorPhone());
		uw.setUser(user);
		return uw;
	}

}
