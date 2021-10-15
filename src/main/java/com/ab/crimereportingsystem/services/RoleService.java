package com.ab.crimereportingsystem.services;

import java.util.List;

import com.ab.crimereportingsystem.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.crimereportingsystem.domains.Role;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepository repository;


	public Role save (Role role) {
		return repository.save(role);
	}


	public Role update(Role role) {
		return repository.save(role);
	}


	public void delete(Role role) {
		repository.delete(role);

	}


	public Role getById(Long id) {
		return repository.findById(id).get();
	}
	
	public Role getByRole(String role) {
		return repository.findByRole(role);
	}


	public List<Role> getAll() {
		 List<Role> all = (List<Role>) repository.findAll();
		return all;
	}

}
