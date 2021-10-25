package com.peaksoft.controller;

import com.peaksoft.model.Book;
import com.peaksoft.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    //localhost:8080/books
    @GetMapping
    public String listBook(Model model){
        model.addAttribute("books",bookService.listBook());
        return "books";
    }

//localhost/books/add-book
    @GetMapping("/add-book")
    public String addBook(Book book){
        return "add-book";
    }

    @PostMapping("/save-book")
    public String saveBook(@ModelAttribute("book") Book book){
        bookService.addBook(book);
        return "redirect:/books";
    }
}
