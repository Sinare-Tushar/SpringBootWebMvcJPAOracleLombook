package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.modal.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
