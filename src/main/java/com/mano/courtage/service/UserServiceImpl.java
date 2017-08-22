package com.mano.courtage.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mano.courtage.domain.User;
import com.mano.courtage.dto.UserDTO;
import com.mano.courtage.repo.UserDao;

@Service
public class UserServiceImpl implements UserService{

	@Inject
	UserDao userDao;
	
	@Override
	public User create(User t) throws Exception {
		// TODO Auto-generated method stub
		return userDao.save(t);
	}

	@Override
	public boolean deleteIfPossible(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User find(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User validateNew(User t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User convertDtoToDomain(UserDTO userDto) {
		User user = new User();
		user.setAddress(userDto.getAddress());
		user.setCity(userDto.getCity());
		user.setProvince(userDto.getProvince());
		user.setEmail(userDto.getEmail());
		user.setEnabled(true);
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setPassword(userDto.getPassword());
		user.setPersonnalPhone(userDto.getPassword());
		return user;
		
	}

}
