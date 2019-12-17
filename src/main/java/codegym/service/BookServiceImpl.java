package codegym.service;

import codegym.model.Book;
import codegym.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public Iterable<Book> getList() {
        return bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).get();
    }
}
