package com.codewithsanthosh.blog.servics;
import java.util.List;

import com.codewithsanthosh.blog.entities.User;
import com.codewithsanthosh.blog.payloads.UserDto;
public interface UserService {
	
	
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user,Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
