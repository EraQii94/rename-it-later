package com.example.ecommerce.dao;

import com.example.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduvtRepository extends JpaRepository<Product, Long> {
}
