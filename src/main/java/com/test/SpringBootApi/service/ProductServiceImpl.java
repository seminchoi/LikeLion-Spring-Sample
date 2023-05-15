package com.test.SpringBootApi.service;

import com.test.SpringBootApi.domain.Product;
import com.test.SpringBootApi.dto.ProductReturnDto;
import com.test.SpringBootApi.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {
        try {
            return productRepository
                    .save(
                    new Product(
                            product.getProductName(),
                            product.getPrice()
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<ProductReturnDto> findAll(){
        List<Product> productList = productRepository.findAll();
//        List<ProductReturnDto> productReturnDtoList = new ArrayList<>();
//
//        for (Product product : productList) {
//            productReturnDtoList.add(new ProductReturnDto(product));
//        }
//
        return productList.stream().map(ProductReturnDto::new).collect(Collectors.toList());
    }

    @Override
    public ProductReturnDto findById(Long id) {
        try {
            Optional<Product> productData = productRepository.findById(id);

            if (productData.isPresent()) {
                Product product = productData.get();
                ProductReturnDto productReturnDto = new ProductReturnDto(product);

                return productReturnDto;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Product update(Long id, Product product) {

        try {
            Optional<Product> productData = productRepository.findById(id);
            if (productData.isPresent()) {
                Product _product = productData.get();
                _product.setProductName(product.getProductName());
                _product.setPrice(product.getPrice());
                productRepository.save(_product);
                return _product;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void delete(Long id) {
        try {
            productRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
