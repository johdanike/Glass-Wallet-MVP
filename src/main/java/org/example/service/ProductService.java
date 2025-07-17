package org.example.service;


import org.example.dto.request.AddProductRequest;
import org.example.dto.response.AddProductResponse;
import org.example.model.Product;

public interface ProductService {
    Product getProductBy(String id);

    AddProductResponse add(AddProductRequest productRequest);
}
