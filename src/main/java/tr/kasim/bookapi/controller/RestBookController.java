/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.kasim.bookapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.kasim.bookapi.model.Book;
import tr.kasim.bookapi.service.BookService;

/**
 *
 * @author SelmanKasim
 */

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class RestBookController {

    @Autowired
    private BookService bookService;

    //Get All Books
    @GetMapping("/books")
    public ResponseEntity<List<Book>> list() {
        List<Book> list = bookService.list();
        return ResponseEntity.ok().body(list);
    }

    //Save the Book
    @PostMapping("/book/new")
    public ResponseEntity<?> save(@RequestBody Book book) {
        long id = bookService.save(book);
        return ResponseEntity.ok().body("Book successfully created with id:" + id + ",author: "+book.getAuthor());
    }
    
    //Get a Single Book
    @GetMapping("/book/{id}")
    public ResponseEntity<Book> get(@PathVariable("id") long id ){
        Book book = bookService.get(id);
        return ResponseEntity.ok().body(book);
    }
    
    //Update a Book 
    @PutMapping("/book/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Book book){
        bookService.update(id, book);
        return ResponseEntity.ok().body("Book has been updated successfully."+ book.getId());
        //book.getId() kaldır.
    }
    
    //Delete a Book
    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id){
        bookService.delete(id);
        return ResponseEntity.ok().body("Book has been deleted by id:"+id);
    }

}
