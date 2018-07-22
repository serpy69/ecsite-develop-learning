package com.example.ecsitedeveloplearning.ec.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecsitedeveloplearning.ec.shop.model.Product;

@Repository
public interface ManagementRepository extends JpaRepository<Product, Long> {

}
