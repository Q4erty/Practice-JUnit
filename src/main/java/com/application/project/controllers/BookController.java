package com.application.project.controllers;

import com.application.project.domain.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class BookController {

    @GetMapping(path = "/books")
    public Book retrieveBook(){
        return Book.builder()
                .isbn("978-0-13-478627-5")
                .title("The Enigma of Eternity")
                .author("Aria Montgomery")
                .yearPublished("2005")
                .build();
    }

    @PostMapping(path = "/books")
    public Book createBook(@RequestBody final Book book){
        log.info("Got book: {}", book.toString());
        return book;
    }
}
