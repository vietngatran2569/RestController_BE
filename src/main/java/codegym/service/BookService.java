package codegym.service;

import codegym.model.Book;
import codegym.model.Product;

public interface BookService {
    Iterable<Book> getList();
    Book save(Book book);
    void delete(Long id);
    Book findById(Long id);
}
