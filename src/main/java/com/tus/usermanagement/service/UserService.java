package com.tus.usermanagement.service;

import com.tus.usermanagement.dto.UserDto;
import com.tus.usermanagement.entity.UserEntity;

public interface UserService {
	
	public UserEntity signUp(UserDto userDto);

}
