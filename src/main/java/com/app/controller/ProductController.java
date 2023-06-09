package com.app.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.app.modal.Product;
import com.app.service.ProductService;

@Controller
@RequestMapping("emp")
public class ProductController {
	private static final String REGISTER = "Register";
	private static final String DATA = "Data";
	private static final String PRODUCT = "product";
	@Autowired
	private ProductService service;

	@GetMapping("show")
	public String showPages(Model m) {
		m.addAttribute("msg", "Welcome App:" + new Date());
		return "Home";
	}

	@GetMapping("reg")
	public String showReg(Model map) {
		map.addAttribute(PRODUCT, new Product());
		return REGISTER;
	}
	
	@PostMapping(value = "save")
	public String saveData(@ModelAttribute Product product, Model map) {
		Integer id = service.saveProduct(product);
		map.addAttribute("message", "Product'" + id + "'created!!");
		map.addAttribute(PRODUCT, new Product());
		return REGISTER;
	}

	@GetMapping("all")
	public String showAll(Model map) {
		List<Product> allProduct = service.getAllProducts();
		map.addAttribute("list", allProduct);
		return DATA;

	}

	@GetMapping(value = "edit")
	public String showEdit(@RequestParam Integer id, Model map) {
		Optional<Product> p = service.getProductById(id);
		map.addAttribute(PRODUCT, p);
		map.addAttribute("Mode", "EDIT");
		return REGISTER;
	}
	
	@DeleteMapping(value="delete")
		public String deleteId(@RequestParam Integer id, Model map) {
		service.deleteProduct(id);
		List<Product> allProduct = service.getAllProducts();
		map.addAttribute("list", allProduct);
		return DATA;
	}
	
}
