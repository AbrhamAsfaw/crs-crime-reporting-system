package com.ab.crimereportingsystem.repositories;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.ab.crimereportingsystem.domains.News;

public interface NewsRepository extends PagingAndSortingRepository<News, Long> {

}
