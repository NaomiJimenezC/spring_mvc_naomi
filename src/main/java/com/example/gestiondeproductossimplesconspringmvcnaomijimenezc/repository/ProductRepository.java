package com.example.gestiondeproductossimplesconspringmvcnaomijimenezc.repository;

import com.example.gestiondeproductossimplesconspringmvcnaomijimenezc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}