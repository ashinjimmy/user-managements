package com.tus.usermanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tus.usermanagement.dto.UserDto;
import com.tus.usermanagement.entity.UserEntity;
import com.tus.usermanagement.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

//import io.swagger.annotations.Api;

//@Api
@Tag(name = "User Management", description = "User Management APIs")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@Operation(summary = "User Registration", description = "Registration of the user by providing required details")
	@ApiResponses({ @ApiResponse(responseCode = "200", content = {
			@Content(schema = @Schema(implementation = UserController.class), mediaType = "application/json") }),
			@ApiResponse(responseCode = "404", content = { @Content(schema = @Schema()) }),
			@ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
	@PostMapping("/signUp")
	public UserEntity signUp(@RequestBody UserDto userDto) {
		System.out.println("----------------");
		return userService.signUp(userDto);
	}

//@RequestMapping("/jwt")
//	public ResponseEntity<T> authenticate(@RequestBody AuthDto authDto){
//		String userName 
//	}

}
