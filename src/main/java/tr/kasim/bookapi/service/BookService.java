package tr.kasim.bookapi.service;

import java.util.List;
import tr.kasim.bookapi.model.Book;

/**
 *
 * @author SelmanKasim
 */
public interface BookService {
    
     
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
