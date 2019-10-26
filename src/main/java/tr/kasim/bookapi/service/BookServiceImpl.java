/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.bookapi.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tr.kasim.bookapi.dao.BookDao;
import tr.kasim.bookapi.model.Book;

/**
 *
 * @author SelmanKasim
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional
    public long save(Book book) {
        return bookDao.save(book);
    }

    @Override
    @Transactional
    public Book get(long id) {
        return bookDao.get(id);
    }

    @Override
    @Transactional
    public List<Book> list() {
        return bookDao.list();

    }

    @Override
    @Transactional
    public void update(long id, Book book) {
        bookDao.update(id, book);

    }

    @Override
    @Transactional
    public void delete(long id) {
        bookDao.delete(id);
    }

}
