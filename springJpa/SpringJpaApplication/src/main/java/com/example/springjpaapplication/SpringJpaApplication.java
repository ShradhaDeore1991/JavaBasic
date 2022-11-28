package com.example.springjpaapplication;

import com.example.springjpaapplication.entity.Books;
import com.example.springjpaapplication.service.BooksService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringJpaApplication {


    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringJpaApplication.class, args);
        BooksService booksService = applicationContext.getBean(BooksService.class);
        Books books = applicationContext.getBean(Books.class);
        books.setBookname("fairy tales");
        books.setAuthor("chinnekw");
        books.setPrice(100);
        //saving books data
        System.out.println(booksService.saveBook(books));
        //getting boks data by id
        System.out.println(booksService.getBooks(1));
        books.setBookname("fairy tales");
        books.setAuthor("chinnekw");
        books.setPrice(500);
        //updating the price of book
        System.out.println(booksService.update(books));
        //deleting the books data
        books.setBookname("Harry Potter");
        books.setAuthor("J. K. Rowling");
        books.setPrice(300);
        System.out.println(booksService.saveBook(books));

        //all data
        List<Books> books1= booksService.getAllBooks();
        books1.forEach(System.out::println);

        //delete
        booksService.deleteBook(1);
        System.out.println(books);







    }



}
