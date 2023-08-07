package com.example.bookservice.repository;

import com.example.bookservice.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryBookRepository implements BookRepository{

    private Map<Long, Book> books = new HashMap<>();
    private Long nextId = 1L;


    @Override
    public List<Book> getBooks() {
        return new ArrayList<>(books.values());
    }

    @Override
    public Book getById(Long id) {
        return books.get(id);
    }

    @Override
    public void createBook(Book book) {

        book.setId(nextId);
        books.put(nextId,book);
        nextId++;
    }
}
