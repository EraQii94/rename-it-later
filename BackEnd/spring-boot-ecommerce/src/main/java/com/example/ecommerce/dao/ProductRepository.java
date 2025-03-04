package com.example.ecommerce.dao;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.projection.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
//@RepositoryRestResource(collectionResourceRel = "products", path = "products")
@RepositoryRestResource(excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Long> {
}

