package com.ijse.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.ijse.demo.dto.ProductDTO;
import com.ijse.demo.entity.Product;

@Service
public interface ProductService {
    List<Product> getAllProducts();
    Product createProduct(ProductDTO productDTO);
    Product findProduct(Long id);
    Product updateProduct(Long id,Product product);
    List<Product> getProductsByCategory(Long id);
}
