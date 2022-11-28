package com.example.springjpaapplication.repository;

import com.example.springjpaapplication.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Integer> {
}
