package com.example.springjpaapplication.service;

import com.example.springjpaapplication.entity.Books;
import com.example.springjpaapplication.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BooksService {
    @Autowired
    private BooksRepository booksRepository;
    
    public List<Books> getAllBooks()
    {
        return  booksRepository.findAll();
    }

    public Books getBooks(int bookid)
    {
        return  booksRepository.findById(bookid).get();
    }

    public void deleteBook( int bookid)
    {
         booksRepository.deleteById(bookid);
    }

    public int saveBook( Books books)
    {
         booksRepository.save(books);
        return books.getBookid();
    }

    public Books update( Books books)
    {
         booksRepository.save(books);
        return books;
    }
}
