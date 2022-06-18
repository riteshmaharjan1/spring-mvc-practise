package com.springmvc.springmvc.repository;

import com.springmvc.springmvc.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepository {
    public HashMap<String, Book> bookCollection = new HashMap<>();

    public Book create(Book book) {
        bookCollection.put(book.getIsbn(), book);
        return book;
    }

    public Book updateBook(Book book) {
        bookCollection.put(book.getIsbn(), book);
        return book;
    }

    public void deleteBook(String isbn) {
        bookCollection.remove(isbn);
    }

    public Book getBook(String isbn){
        return bookCollection.get(isbn);
    }
}
