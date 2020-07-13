package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.model.Books;

public interface BookRepository extends JpaRepository<Books, Integer> {

	
}
