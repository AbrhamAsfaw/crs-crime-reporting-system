package com.ab.crimereportingsystem.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ab.crimereportingsystem.domains.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);

}
