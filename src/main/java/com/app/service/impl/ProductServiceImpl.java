package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.modal.Product;
import com.app.repo.ProductRepository;
import com.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repo;

	@Transactional
	public Integer saveProduct(Product p) {
		p = repo.save(p);
		return p.getId();
	}

	@Transactional(readOnly = true)
	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}

	@Transactional
	public void deleteProduct(Integer id) {
		repo.deleteById(id);
	}

	@Transactional
	public Optional<Product> getProductById(Integer id) {

		return repo.findById(id);
	
}

}
