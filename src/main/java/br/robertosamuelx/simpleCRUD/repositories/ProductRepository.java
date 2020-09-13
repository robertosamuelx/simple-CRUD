package br.robertosamuelx.simpleCRUD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.robertosamuelx.simpleCRUD.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
