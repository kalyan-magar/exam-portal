package com.examportal.models;

import java.util.HashSet;
import java.util.Set;

import org.springframework.aot.nativex.NativeConfigurationWriter;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
@Id
private long roleId;
private String roleName;



@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "role")
private Set<UserRole> userRoles=new HashSet<>();

public long getRoleId() {
	return roleId;
}
public void setRoleId(long roleId) {
	this.roleId = roleId;
}
public String getRoleName() {
	return roleName;
}
public void setRoleName(String roleName) {
	this.roleName = roleName;
}


}
