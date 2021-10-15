package com.ab.crimereportingsystem.services;

import java.util.Collections;
import java.util.List;

import com.ab.crimereportingsystem.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.crimereportingsystem.domains.Comment;
import com.ab.crimereportingsystem.domains.News;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository repository;


	public Comment save (Comment comment) {
		return repository.save(comment);
	}


	public Comment update(Comment comment) {
		return repository.save(comment);
	}


	public void delete(Comment comment) {
		repository.delete(comment);

	}


	public Comment getById(Long id) {
		return repository.findById(id).get();
	}
	
	public List<Comment> getByNews(News news) {
		 List<Comment> all = repository.findByNews(news);
		 Collections.reverse(all);
		return all;
	}


	public List<Comment> getAll() {
		 List<Comment> all = (List<Comment>) repository.findAll();
		 Collections.reverse(all);
		return all;
	}

}
