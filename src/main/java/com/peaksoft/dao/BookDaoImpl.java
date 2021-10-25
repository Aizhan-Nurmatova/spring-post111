package com.peaksoft.dao;

import com.peaksoft.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl  implements BookDao{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addBook(Book book) {
        Session session = sessionFactory.openSession();
        session.persist(book);
    }

    @Override
    public List<Book> listBook() {
        Session session = sessionFactory.openSession();
        List<Book> book =  session.createQuery("from Book" ).getResultList();
        return book;
    }

}
