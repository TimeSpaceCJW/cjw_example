package com.example.cjw_example.service;

import com.example.cjw_example.domain.Product;
import com.example.cjw_example.exception.ResourceNotFoundException;
import com.example.cjw_example.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {

    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findOne(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
    }

    @Transactional
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Transactional
    public Product update(Long id, Product newProduct) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
        product.setName(newProduct.getName());
        product.setDetail(newProduct.getDetail());
        product.setPrice(newProduct.getPrice());

        return productRepository.save(product);
    }

    @Transactional
    public void delete(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product", "id", id));
        productRepository.delete(product);
    }
}
