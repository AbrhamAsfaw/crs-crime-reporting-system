package com.ab.crimereportingsystem.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.ab.crimereportingsystem.domains.WantedPerson;

public interface WantedPersonRepository extends PagingAndSortingRepository<WantedPerson, Long>{

}
