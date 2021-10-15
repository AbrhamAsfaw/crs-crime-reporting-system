package com.ab.crimereportingsystem.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.ab.crimereportingsystem.domains.StolenVehicle;

public interface StolenVehicleRepository extends PagingAndSortingRepository<StolenVehicle, Long> {

}
