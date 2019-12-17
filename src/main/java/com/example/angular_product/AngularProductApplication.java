package com.example.angular_product;

import codegym.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EntityScan("codegym.model")
@ComponentScan("codegym.controller")
@EnableJpaRepositories("codegym.repository")

public class AngularProductApplication {

    @Bean
    public BookService bookService(){
        return new BookServiceImpl();
    }
    @Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
    public static void main(String[] args) {
        SpringApplication.run(AngularProductApplication.class, args);
    }

}
