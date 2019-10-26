/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SelmanKasim
 */
package tr.kasim.bookapi.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tr.kasim.bookapi.model.Book;

/**
 *
 * @author SelmanKasim
 */

@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public long save(Book book) {
        sessionFactory.getCurrentSession().save(book);
        return book.getId();
    }

    @Override
    public Book get(long id) {
        Book book = sessionFactory.getCurrentSession().get(Book.class, id);
        return book;
    }

    @Override
    public List<Book> list() {
        List<Book> list = sessionFactory.getCurrentSession().createQuery("from Book").list();
        return list;
    }

    @Override
    public void update(long id, Book book) {
        
        //"session.ById(Class).load(o)" and "session.find(Class,o)"  do same thing.
        
        Session session = sessionFactory.getCurrentSession();
        Book oldBook = session.byId(Book.class).load(id);
        oldBook.setTitle(book.getTitle());
        oldBook.setAuthor(book.getAuthor());
        session.flush();

       
    }

    @Override
    public void delete(long id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = session.byId(Book.class).load(id);
        session.delete(book);
    }

}
