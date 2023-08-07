package com.example.bookclient.client;

import com.example.bookclient.dto.BookDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

@FeignClient(name = "BOOK-SERVICE")
public interface BookClientFeign {

    @GetMapping("/books")
    List<BookDto> getAllBooks();

    @GetMapping("/books/{id}")
    BookDto getBookById(@PathVariable Long id);

    @PostMapping("/books")
    BookDto addBook(@RequestBody BookDto book);
}
