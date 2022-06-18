package com.springmvc.springmvc.service;

import com.springmvc.springmvc.domain.Book;
import com.springmvc.springmvc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book get(String isbn){
        return bookRepository.getBook(isbn);
    }
    public Book create(Book book){
        return bookRepository.create(book);
    }

    public  Book update (Book book){
        return bookRepository.updateBook(book);
    }

    public void delete(String isbn){
         bookRepository.deleteBook(isbn);
    }
}
