package com.test.SpringBootApi.service;

import com.test.SpringBootApi.domain.Product;
import com.test.SpringBootApi.dto.ProductReturnDto;

import java.util.Optional;

public interface ProductService {

    public Product save(Product product);
    public ProductReturnDto findById(Long id);
    public Product update(Long id, Product product);
    public void delete(Long id);

}
