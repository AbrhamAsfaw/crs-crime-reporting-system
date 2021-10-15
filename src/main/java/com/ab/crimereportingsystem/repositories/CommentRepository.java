package com.ab.crimereportingsystem.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ab.crimereportingsystem.domains.Comment;
import com.ab.crimereportingsystem.domains.News;

public interface CommentRepository extends CrudRepository<Comment, Long>{
	public List<Comment> findByNews(News news);

}
