import { Component, OnInit } from '@angular/core';
import { Book } from './book';
import { BookService } from './book.service';
import { resetCompiledComponents } from '@angular/core/src/render3/jit/module';

@Component({
    selector: 'app-book',
    templateUrl: './book.component.html',
    styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

    books: Book[];
    book = new Book();
    constructor(private _bookService: BookService) { }

    ngOnInit(): void {
        this.getBooks();
    }

    private reset() {
        this.book.id = null;
        this.book.title = null;
        this.book.author = null;
    }

    getBooks(): void {
        this._bookService.getAllBooks()
            .subscribe((bookData) => {
                this.books = bookData,
                    console.log(bookData)
            }, (error) => {
                console.log(error);
            });
    }

    addBook(): void {
        this._bookService.addBook(this.book)
            .subscribe((response) => {
                console.log(response)
                this.reset();
                this.getBooks();
            }, (error) => {
                console.log(error);
            });

    }

    deleteBook(id: String): void {
        this._bookService.deleteBook(id)
            .subscribe((response) => {
                console.log(response);
                this.getBooks();
            },
                (error) => {
                    console.log(error);
                });
    }

    getBookById(id: string){
        this._bookService.getBookById(id)
            .subscribe((bookData) => {this.book = bookData; this.getBooks();},
                 (error) => {
                console.log(error); 
            });
    } 
        


}