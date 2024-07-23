package com.example.byself.services;

import com.example.byself.model.Product;
import com.example.byself.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    private List<Product> products = new ArrayList<>();

    public List<Product> listProducts(String title) {
        if (title != null) productRepository.findAll();
            return productRepository.findAll();
    }

    public void saveProduct(Product product) {
        log.info("Saving new{}", product);
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null); //Если товар не найден, то null
    }
}
