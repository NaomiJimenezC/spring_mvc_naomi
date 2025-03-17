package com.example.gestiondeproductossimplesconspringmvcnaomijimenezc.service;


import com.example.gestiondeproductossimplesconspringmvcnaomijimenezc.model.Product;
import com.example.gestiondeproductossimplesconspringmvcnaomijimenezc.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
