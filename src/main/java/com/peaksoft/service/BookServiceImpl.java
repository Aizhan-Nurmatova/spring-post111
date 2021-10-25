package com.peaksoft.service;

import com.peaksoft.dao.BookDao;
import com.peaksoft.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl  implements BookService{

    @Autowired
    private BookDao bookDao;


    @Override
    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    @Override
    public List<Book> listBook() {
        return bookDao.listBook();
    }
}
