package com.ab.crimereportingsystem.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ab.crimereportingsystem.domains.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByRole(String role);

}
