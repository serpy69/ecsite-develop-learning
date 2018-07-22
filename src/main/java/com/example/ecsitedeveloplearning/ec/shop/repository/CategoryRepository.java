package com.example.ecsitedeveloplearning.ec.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecsitedeveloplearning.ec.shop.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
