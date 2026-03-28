package com.mynewapp.ProductCatalog.repository;

import com.mynewapp.ProductCatalog.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
