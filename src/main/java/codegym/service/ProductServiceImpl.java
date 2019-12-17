package codegym.service;

import codegym.model.Product;
import codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;
    @Override
    public Iterable<Product> getList() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id).get();
    }
}
