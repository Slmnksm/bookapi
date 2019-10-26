/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.bookapi.dao;

import java.util.List;
import tr.kasim.bookapi.model.Book;

/**
 *
 * @author SelmanKasim
 */

public interface BookDao {
    
    //Save the book
    long save(Book book);
    
    //Get a single book
    Book get(long id);
    
    //Get all the book
    List<Book> list();
    
    //Update the book
    void update(long id, Book book);
    
    //Delete a book
    void delete(long id);
    
    
    
    
    
    
}
