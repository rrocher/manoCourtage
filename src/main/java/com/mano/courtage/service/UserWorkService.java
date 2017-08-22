package com.mano.courtage.service;

import com.mano.courtage.domain.User;
import com.mano.courtage.domain.UserWork;
import com.mano.courtage.dto.UserDTO;
import com.mano.courtage.dto.UserWorkDTO;

public interface UserWorkService extends IService<UserWork>{
	public UserWork convertDtoToDomain(UserWorkDTO userDto, User user);
}
