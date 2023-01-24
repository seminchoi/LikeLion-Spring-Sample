package com.test.SpringBootApi.service;

import com.test.SpringBootApi.domain.Product;

import java.util.Optional;

public interface ProductService {

    public Product save(Product product);
    public Optional<Product> findById(Long id);
    public Product update(Long id, Product product);
    public void delete(Long id);

}
