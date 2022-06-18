package com.springmvc.springmvc.controller;

import com.springmvc.springmvc.domain.Book;
import com.springmvc.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add")
    public ResponseEntity<?> addBook(@RequestBody Book book) {
        Book mBook = bookService.create(book);
        return new ResponseEntity<>(mBook, HttpStatus.OK);
    }

    @GetMapping("/get/{isbn}")
    public ResponseEntity<?> getBook(@PathVariable String isbn) {
        Book mBook = bookService.get(isbn);
        return new ResponseEntity<>(mBook, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateBook(@RequestBody Book book) {
        Book mBook = bookService.update(book);
        return new ResponseEntity<>(mBook, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{isbn}")
    public void deleteBook(@PathVariable String isbn) {
        bookService.delete(isbn);
    }
}
