package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.modal.Product;

@Service
public interface ProductService {
	public Integer saveProduct(Product p);

	public List<Product> getAllProducts();

	public void deleteProduct(Integer id);

	public Optional<Product> getProductById(Integer id);
}
