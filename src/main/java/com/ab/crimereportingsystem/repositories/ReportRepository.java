package com.ab.crimereportingsystem.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ab.crimereportingsystem.domains.Report;
import com.ab.crimereportingsystem.domains.User;

public interface ReportRepository  extends CrudRepository<Report, Long>{
	List<Report> findBySeen(boolean seen);
	List<Report> findBySeenAndUser(boolean seen, User user);

}
