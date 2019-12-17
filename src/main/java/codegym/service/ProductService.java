package codegym.service;

import codegym.model.Product;

public interface ProductService {
    Iterable<Product> getList();
    Product save(Product product);
    void delete(Long id);
    Product findById(Long id);
}
