package codegym.controller;

import codegym.model.Book;
import codegym.model.Product;
import codegym.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/api/books")
    public ResponseEntity<List<Book>> getList(){
        List<Book> bookList = (List<Book>) bookService.getList();
        return  new ResponseEntity<>(bookList, HttpStatus.OK);
    }

    @PostMapping("/api/books")
    public ResponseEntity<Void> addBook(@RequestBody Book book){
        bookService.save(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/api/books/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id){
        bookService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/api/books/")
    public ResponseEntity<Book> updateBook(@RequestBody Book book){
        bookService.save(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
