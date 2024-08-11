package com.examportal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.models.Role;
import com.examportal.models.UserRole;

public interface RoleRepository  extends JpaRepository<Role, Long>{

	

}
