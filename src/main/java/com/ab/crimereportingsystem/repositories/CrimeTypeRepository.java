package com.ab.crimereportingsystem.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ab.crimereportingsystem.domains.CrimeType;

public interface CrimeTypeRepository extends CrudRepository<CrimeType, Long> {

}
