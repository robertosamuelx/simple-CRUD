package br.robertosamuelx.simpleCRUD.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.robertosamuelx.simpleCRUD.entities.Product;
import br.robertosamuelx.simpleCRUD.repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;

	@GetMapping
	public List<Product> listProducts(){
		return productRepository.findAll();
	}
	
	@PutMapping
	public void saveProduct(@RequestBody Product product) {
		productRepository.save(product);
	}
	
	@PostMapping
	public void editProduct(@RequestParam Integer id, @RequestBody Product product) {
		product.setId(id);
		productRepository.save(product);
	}
	
	@DeleteMapping
	public void deleteProduct(@RequestParam Integer id) {
		productRepository.deleteById(id);
	}
}
