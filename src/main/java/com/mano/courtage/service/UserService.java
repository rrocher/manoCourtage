package com.mano.courtage.service;

import com.mano.courtage.domain.User;
import com.mano.courtage.dto.UserDTO;

public interface UserService extends IService<User>{
	public User convertDtoToDomain(UserDTO userDto);

}
