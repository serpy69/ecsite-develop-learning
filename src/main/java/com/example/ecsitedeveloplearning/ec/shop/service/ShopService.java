package com.example.ecsitedeveloplearning.ec.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecsitedeveloplearning.ec.shop.model.Product;
import com.example.ecsitedeveloplearning.ec.shop.repository.ShopRepository;

@Service
public class ShopService {
	
	@Autowired
	ShopRepository shopRepository;
	
	// 商品情報全件取得
	public List<Product> findAll() {
		return shopRepository.findAll();
	}
	
	// 商品情報取得
	public Optional<Product> findOne(long id) {
		return shopRepository.findById(id);
	}
	
	public Long getCount() {
		Long count = shopRepository.count();
		return count;
	}
	
}
