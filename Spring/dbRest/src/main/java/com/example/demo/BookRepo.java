package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

//import com.example.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
	
	public Optional<Book> findById(Integer id);
	@SuppressWarnings("unchecked")
	public Book save(Book book);
	public List<Book> findAll();
	boolean existsById(Integer id);
	void deleteById(Integer id);

}
