package com.examportal.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.models.User;


public interface UserRepository  extends JpaRepository<User, Long>{

public	User findByUsername(String username) throws Exception;

}
