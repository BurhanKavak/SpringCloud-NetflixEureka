package com.example.bookclient.controller;

import com.example.bookclient.client.BookClientFeign;
import com.example.bookclient.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;
@RestController
@RequestMapping("book-client")
public class BookClientController {

    private final BookClientFeign bookClientFeign;

    @Autowired
    public BookClientController(BookClientFeign bookClientFeign) {
        this.bookClientFeign = bookClientFeign;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookClientFeign.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookDto getBookById(@PathVariable Long id) {
        return bookClientFeign.getBookById(id);
    }

    @PostMapping
    public BookDto addBook(@RequestBody BookDto bookDTO) {
        return bookClientFeign.addBook(bookDTO);
    }
}

