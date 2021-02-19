package com.geekbrains.spring.mvc.services;

import com.geekbrains.spring.mvc.model.Product;
import com.geekbrains.spring.mvc.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void create(String title, float cost) {
        productRepository.create(title, cost);
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public Product get(int id) {
        return productRepository.get(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.getAll();
    }

    public void update(int id, String title, float cost) {
        productRepository.update(id, title, cost);
    }

    public void delete(int id) {
        productRepository.delete(id);
    }

    public int count() {
        return getAllProducts().size();
    }

    public float averageCost() {
        List<Product> products = getAllProducts();
        float avg = 0;
        for (Product product : products) {
            avg += product.getCost();
        }
        return avg;
    }
}
