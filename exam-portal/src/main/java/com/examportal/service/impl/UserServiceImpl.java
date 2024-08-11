package com.examportal.service.impl;

import java.security.PublicKey;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.examportal.models.Role;
import com.examportal.models.User;
import com.examportal.models.UserRole;
import com.examportal.repo.RoleRepository;
import com.examportal.repo.UserRepository;
import com.examportal.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public User cratingUser(User user, Set<UserRole> userRoles) throws Exception  {
		// checking user exist or not 
	User local=	userRepository.findByUsername(user.getUsername());
	
	if(local!=null) {
		throw new Exception("user Already Exist");
	}else {
            for (UserRole ur : userRoles) {
           this.roleRepository.save(ur.getRole());
		}
            // here we have add all user role
         user.getUserRoles().addAll(userRoles);
    return    userRepository.save(user);
	}
		
	
}

}
