package com.tus.usermanagement.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tus.usermanagement.dto.UserDto;
import com.tus.usermanagement.entity.UserEntity;
import com.tus.usermanagement.mapper.UserMapper;
import com.tus.usermanagement.repository.UserRepository;
import com.tus.usermanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserEntity signUp(UserDto userDto) {
		UserEntity userEntity = new UserEntity();
		userRepository.save(UserMapper.mapToUser(userEntity,userDto));
		
		System.out.println(userEntity);
		return userEntity;
	}

}
