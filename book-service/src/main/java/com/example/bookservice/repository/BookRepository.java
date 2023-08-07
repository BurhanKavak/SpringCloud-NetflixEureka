package com.example.bookservice.repository;

import com.example.bookservice.domain.Book;

import java.util.List;

public interface BookRepository {

    List<Book> getBooks();

    Book getById(Long id);

    void createBook(Book book);
}
