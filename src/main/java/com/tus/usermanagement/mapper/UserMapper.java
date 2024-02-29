package com.tus.usermanagement.mapper;

import java.time.LocalDateTime;
import java.util.Random;

import com.tus.usermanagement.dto.UserDto;
import com.tus.usermanagement.entity.UserEntity;

public class UserMapper {

	public static UserEntity mapToUser(UserEntity userEntity, UserDto userDto) {

		userEntity.setUserName(userDto.getUserName());
		userEntity.setPassword(userDto.getPassword());
		userEntity.setEmailId(userDto.getEmailId());
		userEntity.setUserRole(userDto.getUserRole());
		userEntity.setCreatedAt(LocalDateTime.now());

		userEntity.setUserId(userIdGenerator());;

		return userEntity;
	}

	private static String userIdGenerator() {
		//return UUID.randomUUID().toString();
		return String.valueOf(new Random().nextInt(100, 999));
		
	}

}
