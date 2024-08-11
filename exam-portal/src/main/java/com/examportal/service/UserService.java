package com.examportal.service;

import java.util.Set;

import com.examportal.models.User;
import com.examportal.models.UserRole;

public interface UserService {
	// creating user 
	public User cratingUser(User user, Set<UserRole> userRoles) throws Exception;

}
