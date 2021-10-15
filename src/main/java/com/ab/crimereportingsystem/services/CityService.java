package com.ab.crimereportingsystem.services;

import java.util.List;

import com.ab.crimereportingsystem.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.crimereportingsystem.domains.City;

@Service
public class CityService {
	
	@Autowired
	private CityRepository repository;


	public City save (City city) {
		return repository.save(city);
	}


	public City update(City city) {
		return repository.save(city);
	}


	public void delete(City city) {
		repository.delete(city);

	}


	public City getById(Long id) {
		return repository.findById(id).get();
	}


	public List<City> getAll() {
		 List<City> all = (List<City>) repository.findAll();
		return all;
	}

}
