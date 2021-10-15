package com.ab.crimereportingsystem.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.ab.crimereportingsystem.domains.MissingPerson;

public interface MissingPersonRepository extends PagingAndSortingRepository<MissingPerson, Long> {

}
