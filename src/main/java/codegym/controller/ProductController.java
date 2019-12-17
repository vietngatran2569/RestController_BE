package codegym.controller;

import codegym.model.Product;
import codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/api/products")
    public ResponseEntity<List<Product>> getList(){
        List<Product> productList = (List<Product>) productService.getList();
        return  new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @PostMapping("/api/products")
    public ResponseEntity<Void> addProduct(@RequestBody Product product){
        productService.save(product);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/api/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        productService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/api/products/")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
         productService.save(product);
         return new ResponseEntity<>(HttpStatus.OK);
    }


}
